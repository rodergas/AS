/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;
import Excepcions.noHiHaRepresentacions;
import Excepcions.seientsNoDisp;
import Excepcions.pagamentNoAutoritzat;
import Excepcions.serveiNoDisponible;
import Excepcions.noHiHaEspectacles;
import DomainModel.StructFilaColumna;
import DomainModel.StructPreuCanvis;
import DomainModel.StructRepresentacio;
import DomainControllers.FactoriaCtrlCasosDus;
import DomainControllers.CtrlCasDusComprarEntrada;
import Excepcions.seientsNoCoincideixen;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import Frames.PrimeroFrame;
import Frames.TriaEspectaculoFrame;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlVistaComprarEntrada {
    private CtrlCasDusComprarEntrada CtrlCasDusComprarEntrada;
    private VistaComprarEntrada VCE;
    private Float preuP;
   /*
    Si no existeix, es crea una instància del CtrlVistaComprarEntrada
    */
    public CtrlVistaComprarEntrada() {
        if(CtrlCasDusComprarEntrada == null && VCE == null){
            CtrlCasDusComprarEntrada = new CtrlCasDusComprarEntrada();
            VCE = new VistaComprarEntrada();
        }
    }
    /*
    El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual li haurà de 
    retornar els titols dels espectacles que hi ha a la base de dades.
    */
    public void PrOkObteEspectacles() throws noHiHaEspectacles{
        ArrayList<String> titols = new ArrayList<>();
            FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
            CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
            titols = CCDCE.obteEspectacles();
            VCE.mostrarEspectacles(titols);  
    }
    /*
    El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual li haurà de 
    retornar tota la informació(StructRepresentacio) de les representacions de l'espectacle 
    amb titol "titol" a la data "data".
    */
    public void PrOkAssignaRepresentacio(String titol,Date data) throws noHiHaRepresentacions, ParseException{
         FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
         CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
         ArrayList<StructRepresentacio> representacions = CCDCE.obteRepresentacions(titol, data);
         VCE.mostrarRepresentacio(representacions);
    }
    /*
    El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual li haurà de 
    retornar la informació(StructFilaColuma) dels seients lliures per a la representació donada.
    */
    public void PrOkAssignaOcupacio(String nomLocal, String sessio, Integer nEsp) throws seientsNoDisp{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        ArrayList<StructFilaColumna> fc = CCDCE.obteOcupacio(nomLocal, sessio, nEsp);
        VCE.mostrarSeients(fc);
    }
       /*
        El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual li haurà de 
        retornar el preu calculat dels seients seleccionats 
        i els canvis de moneda que pot realitzar (StrucPreuCanvi)
        */
    public void PrOkSeleccionarSeients (ArrayList<StructFilaColumna> seients) throws seientsNoCoincideixen{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        StructPreuCanvis SPC = CCDCE.seleccionarSeients(seients);
        preuP = SPC.getPreu();
        VCE.mostrarPreu(SPC);
    }
    /*
        El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual li haurà de 
        retornar el preu convertit a la moneda "moneda"
        */
    public void PrConvertir (String moneda) throws serveiNoDisponible{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        Float p = CCDCE.obtePreuMoneda(moneda);
        VCE.mostrarCanvi(p);
    }
        /*
        El CtrlVistaComprarEntrada cridarà al CtrlCasDusComprarEntrada, el qual farà el pagament de l'entrada.
        */
    public void PrOkComprarEntrada (String dni, Integer codiB, String numCompte) throws serveiNoDisponible, pagamentNoAutoritzat{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        CCDCE.pagament(dni, codiB, numCompte);
        VCE.mostrarMissatgeFinal();
    }
}

