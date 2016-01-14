/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DomainModel.Entrada;
import DomainModel.Moneda;
import DomainModel.Representacio;
import DomainModel.SeientEnRepresentacio;
import DomainModel.Showscom;
import DataInterface.CtrlRepresentacio;
import DataInterface.CtrlSeientsEnRepresentacio;
import Adapters.FactoriaAdaptadores;
import DataInterface.FactoriaCtrl;
import Adapters.IBankServiceAdapter;
import Adapters.ICurrencyConvertorAdapter;
import DomainModel.StructFilaColumna;
import DomainModel.StructPreuCanvis;
import DomainModel.StructRepresentacio;
import Excepcions.noHiHaEspectacles;
import Excepcions.noHiHaRepresentacions;
import Excepcions.pagamentNoAutoritzat;
import Excepcions.seientsNoDisp;
import Excepcions.serveiNoDisponible;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import webservicexnet.Currency;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlCasDusComprarEntrada {
    private String titolE;
    private Date dataE;
    private String nomLocalE;
    private String sessioE;
    private Integer nombEspectadorsE;
    private ArrayList<SeientEnRepresentacio> seientsE;
    private Float preuE;
    public ArrayList<String> obteEspectacles()throws noHiHaEspectacles {
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusConsultarRepresentacio CCDCR = FCCD.getCtrlCasDusConsultarRepresentacio();
        ArrayList<String> titols = CCDCR.consultaEspectacles();
        return titols;
    }
    
    public ArrayList<StructRepresentacio> obteRepresentacions(String titol, Date data) throws ParseException, noHiHaRepresentacions {
        ArrayList<StructRepresentacio> representacions = new ArrayList<>();
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusConsultarRepresentacio CCDCR = FCCD.getCtrlCasDusConsultarRepresentacio();
        representacions = CCDCR.consultaRepresentacions(titol, data);
        if(representacions.size() == 0) throw new noHiHaRepresentacions("No hi ha representacions pel titol i data donats");
        titolE = titol;
        dataE = data;
        return representacions;
    }
    
    public ArrayList<StructFilaColumna> obteOcupacio(String nomLocal, String sessio, Integer nombEspectadors) throws seientsNoDisp {
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusConsultarOcupacio CCDCO = FCCD.getCtrlCasDusConsultarOcupacio();
        ArrayList<StructFilaColumna> seients = CCDCO.consultaOcupacio(nomLocal, sessio, nombEspectadors);
        nomLocalE = nomLocal;
        sessioE = sessio;
        nombEspectadorsE = nombEspectadors;
        return seients;
    }
    
    public StructPreuCanvis seleccionarSeients(ArrayList<StructFilaColumna> seients){
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        CtrlSeientsEnRepresentacio CSER = FC.getCtrlSeientsEnRepresentacio();
        CtrlRepresentacio CR = FC.getCtrlRepresentacio();
        ArrayList<SeientEnRepresentacio> conjser = new ArrayList<>();
        for(int i = 0; i < seients.size(); ++i){
            
            conjser.add(CSER.getSeientEnRepresentacio(seients.get(i).getFila(), seients.get(i).getColumna(), nomLocalE, sessioE));
        }
        seientsE = new ArrayList<SeientEnRepresentacio>(conjser);
        Representacio r = CR.getRepresentacio(nomLocalE, sessioE);
        boolean b = r.esEstrena();
        float p = r.getPreu();
        Showscom showscom = Showscom.getInstance();
        float comissio = showscom.getComissio();
        ArrayList<Moneda> can = new ArrayList<>(showscom.getCanvis());
        ArrayList<String> canvis= new ArrayList<String>();
        for(int i = 0; i < can.size(); ++i) canvis.add(can.get(i).toString());
        float preu = 0.0f;
        if(b){
            int recarrec = r.getRecarrec();
            preu = nombEspectadorsE * (p + comissio + recarrec);
        }else{
            preu = nombEspectadorsE * (p + comissio);
        }
        preuE = preu;
        StructPreuCanvis preuCanvis = new StructPreuCanvis();
        preuCanvis.setPreu(preuE);
        preuCanvis.setCanvis(canvis);
        return preuCanvis;
    }
    
    public float obtePreuMoneda(String moneda) throws serveiNoDisponible{
        Showscom showscom = Showscom.getInstance();
        Moneda d = showscom.getDivisa();
        FactoriaAdaptadores FA = FactoriaAdaptadores.getInstance();
        ICurrencyConvertorAdapter CCA = FA.getCurrencyConvertorAdapter();
        float resultat = (float) CCA.obtePreuMoneda(d, moneda);
        resultat = resultat * preuE;
        return resultat;
    }
    
    public void pagament(String dni, Integer codiB, String numCompte) throws pagamentNoAutoritzat, serveiNoDisponible{
        Showscom showscom = Showscom.getInstance();
        Integer cb = showscom.getCodiBanc();
        String nc = showscom.getNumeroCompte();
        FactoriaAdaptadores FA = FactoriaAdaptadores.getInstance();
        IBankServiceAdapter BS = FA.getBankServiceAdapter();
        
        Calendar cal = Calendar.getInstance();
        Date dAvui = cal.getTime();
        boolean b = BS.pagament(dni, codiB, numCompte, preuE, cb, nc, dAvui);
        if(!b) throw new pagamentNoAutoritzat("El pagament no està autoritzat");
        
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        CtrlRepresentacio CR = FC.getCtrlRepresentacio();
        Representacio r = CR.getRepresentacio(nomLocalE, sessioE);

        if(b){
           
            Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        session.beginTransaction();
        List<Entrada> l = session.createQuery("from Entrada").list();
        Integer size = l.size(); 
        String idEntrada= String.valueOf(size);
         Entrada e = new Entrada(idEntrada,dni,nombEspectadorsE,dataE,preuE,r,seientsE);
         session.saveOrUpdate(e);
         session.merge(r);
         ArrayList<SeientEnRepresentacio> SeientRes = new ArrayList<>(r.getSER());
         for(int i = 0; i < SeientRes.size(); ++i){
             session.merge(SeientRes.get(i));
         }
        session.getTransaction().commit();
        }
    }    
}
