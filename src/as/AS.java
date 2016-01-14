/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import DataLayer.BaseDeDatos;
import Excepcions.noHiHaRepresentacions;
import Excepcions.seientsNoDisp;
import Excepcions.pagamentNoAutoritzat;
import Excepcions.serveiNoDisponible;
import Excepcions.noHiHaEspectacles;
import DomainModel.StructFilaColumna;
import DomainModel.StructPreuCanvis;
import DomainModel.StructRepresentacio;
import DataInterface.FactoriaCtrl;
import DomainControllers.FactoriaCtrlCasosDus;
import DomainModel.Moneda;
import DomainControllers.CtrlCasDusComprarEntrada;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.imageio.spi.ServiceRegistry;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author rober_000
 */
public class AS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException, noHiHaEspectacles, noHiHaRepresentacions, seientsNoDisp, serveiNoDisponible, pagamentNoAutoritzat {
        // TODO code application logic here
        BaseDeDatos BD = new BaseDeDatos();
        BD.inicializar();
        /*Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Local.class);
        
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
         Para comprobar consRep de espectaculos, tiene que dar una true, hay una estrena en la fecha 30/1/2016
        List<Espectacle> l = session.createQuery("from Espectacle").list();
        System.out.println(l.size());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("30/1/2016");
        
        for(int i = 0; i < l.size(); ++i){
            ArrayList<StructRepresentacio> p =new ArrayList<>();
                   p = l.get(i).consRep(d1);
                   System.out.println(p.size());
            if(p.size() != 0){
                for(int j = 0; j < p.size(); ++j){
                if(p.get(j).isEstrena()){System.out.println("true");}
                }
            }
            }
        */
        
        /*
        Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Local.class);
        
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        List<Representacio> l = session.createQuery("from Representacio").list();
        
        for(int i = 0; i < l.size(); ++i){
            ArrayList<StructFilaColumna> a = l.get(i).consOcup(40);
            System.out.println("AAAAAAAAA" + a.size());
        }
                */
        /*
                Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Local.class);
        
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        Showscom l =(Showscom) session.get(Showscom.class,1);
        System.out.println("AAAAAAAAA" + l.getId());
*/
        /*
        // ---- CREACION DE ENTRADA Y ASSOCIACIONES ----
        Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Local.class);
        
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        session.beginTransaction();
        
        List<Representacio> l = session.createQuery("from Representacio").list();
        Representacio r = l.get(0);
        System.out.println(r.getCKR().getLocal().getNom() + " " + r.getCKR().getSessio().getSessio().toString());
        System.out.println("FECHA REPRESENTACION " + r.getData());
        System.out.println("NUMERO SEIENTS LLIURES " + r.getNombreSeientsLliures());
        ArrayList<SeientEnRepresentacio> S = new ArrayList<>(r.getSER());
        for(int i = 0; i < S.size(); ++i){
            System.out.print(S.get(i).getEstat() + " ");
        }
        ArrayList<SeientEnRepresentacio> auxS = new ArrayList<>(r.getSER());
        ArrayList<SeientEnRepresentacio> auxS2 = new ArrayList<>();
        for(int i = 0; i < 30; i += 2){
            SeientEnRepresentacio ss = auxS.get(i);
            
            auxS2.add(ss);
        }
        Entrada e = new Entrada( "34443",15,r.getData(),30,r,auxS2);
        ArrayList<SeientEnRepresentacio> S2 = new ArrayList<>(r.getSER());
        for(int i = 0; i < S2.size(); ++i){
            System.out.print(S2.get(i).getEstat() + " ");
        }
        System.out.println("NUMERO SEIENTS LLIURES DESPUES " + r.getNombreSeientsLliures());
        ArrayList<SeientEnRepresentacio> a = new ArrayList<>(r.getSER());
        session.saveOrUpdate(e);
        session.saveOrUpdate(r);
        session.getTransaction().commit();
        */
                
        /* ---GET INSTANCE
        Showscom c = new Showscom();
        c = c.getInstance();
        System.out.println(c.getId());
                */
        
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        
        /*CtrlEspectacle CE = FC.getCtrlEspectacle();
        List<Espectacle> LE = CE.getAll();
        for(int i = 0; i < LE.size(); ++i) System.out.println(LE.get(i).getTitol());
        
        Espectacle e2 = CE.getEspectacle("2");
        System.out.println(e2.getTitol());
        */
        /*
        System.out.println(TipusSessio.nit.toString());
        CtrlRepresentacio CR = FC.getCtrlRepresentacio();
        Representacio r = CR.getRepresentacio("Palau Sant Jordi", TipusSessio.nit.toString());
        System.out.println(r.getCKR().getLocal().getNom() + " " + r.esEstrena() );
        Representacio r2 = CR.getRepresentacio("Palau Sant Jordi", TipusSessio.mati.toString());
        System.out.println(r2.getCKR().getLocal().getNom() + " " + r2.esEstrena() );
          */      
        /*
        CtrlSeientsEnRepresentacio CSER = FC.getCtrlSeientsEnRepresentacio();
        SeientEnRepresentacio s = CSER.getSeientEnRepresentacio(2, 4, "Palau Sant Jordi", TipusSessio.mati.toString());
        if(s == null) System.out.println("Soy nulo");
        System.out.println(s.getCKSER().getSeient().getCKS().getFila()+" "+
                s.getCKSER().getSeient().getCKS().getColumna()+" "+
                s.getCKSER().getRepresentacio().getCKR().getLocal().getNom());
                
        */
        /*
        CtrlCasDusConsultarOcupacio CCDCO = FCCD.getCtrlCasDusConsultarOcupacio();
        ArrayList<StructFilaColumna>  s = CCDCO.consultaOcupacio("Teatre" , "mati",20);
        
        CtrlCasDusConsultarRepresentacio CCDCR = FCCD.getCtrlCasDusConsultarRepresentacio();
        ArrayList<String> tit = CCDCR.consultaEspectacles();
        for(int i = 0; i< tit.size(); ++i) System.out.println(tit.get(i));
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("30/1/2016");
        ArrayList<StructRepresentacio> r = CCDCR.consultaRepresentacions("1", d1);
        for(int i = 0; i < r.size(); ++i) System.out.println(r.get(i).getNomLocal() + " " +r.get(i).getSessio().toString() + " " + r.get(i).isEstrena() + " " + r.get(i).getNombreSeientsLliure());
        */
        
        //---------CTRL COMPRAR ENTRADA---------
        
       CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
       ArrayList<String> tit = CCDCE.obteEspectacles();
       for(int i = 0; i < tit.size(); ++i) System.out.println(tit.get(i));
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       Date d1 = sdf.parse("30/1/2016");
       ArrayList<StructRepresentacio> r = CCDCE.obteRepresentacions("1", d1);
       for(int i = 0; i < r.size(); ++i) System.out.println(r.get(i).getNomLocal() + " " +r.get(i).getSessio().toString() + " " + r.get(i).isEstrena() + " " + r.get(i).getNombreSeientsLliure());
       ArrayList<StructFilaColumna> sei = new ArrayList<>();
       
       CCDCE.obteOcupacio(r.get(0).getNomLocal(), r.get(0).getSessio().toString(), 2);
       
       for(int i = 1; i < 2; ++i){
           for(int j = 1; j < 3; ++j){
               StructFilaColumna fc = new StructFilaColumna(i,j); 
               sei.add(fc);
           }
       }
       StructPreuCanvis pc = CCDCE.seleccionarSeients(sei);
       System.out.println(pc.getPreu() + " " + pc.getCanvis().get(0).toString() + " " + pc.getCanvis().get(1).toString());
       
        float res = CCDCE.obtePreuMoneda(Moneda.GBP.toString());
        System.out.println(res);
        
        CCDCE.pagament("43434", 3443,"342432");
    }
                
                
}
