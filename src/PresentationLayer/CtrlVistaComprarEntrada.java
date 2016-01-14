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
    //Es crea una instancia de CtrlVistaComprarEntrada
    public CtrlVistaComprarEntrada() {
        if(CtrlCasDusComprarEntrada == null && VCE == null){
            CtrlCasDusComprarEntrada = new CtrlCasDusComprarEntrada();
            VCE = new VistaComprarEntrada();
        }
    }
    //S'obtenen tots els titols dels espectacles i es passen per parametre per a que es mostrin per pantalla
    public void PrOkObteEspectacles() throws noHiHaEspectacles{
        ArrayList<String> titols = new ArrayList<>();
            FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
            CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
            titols = CCDCE.obteEspectacles();
            VCE.mostrarEspectacles(titols);  
    }
    //S'obtenen les representacions per un titol d'un Espectacle i una data donats 
    //i aquestes es passen per parametre per a que es mostrin per pantalla
    public void PrOkAssignaRepresentacio(String titol,Date data) throws noHiHaRepresentacions, ParseException{
         FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
         CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
         ArrayList<StructRepresentacio> representacions = CCDCE.obteRepresentacions(titol, data);
         VCE.mostrarRepresentacio(representacions);
    }
    //S'obtenen els seients lliures per una representació i es passen per parametre per a que es mostrin per pantalla
    public void PrOkAssignaOcupacio(String nomLocal, String sessio, Integer nEsp) throws seientsNoDisp{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        ArrayList<StructFilaColumna> fc = CCDCE.obteOcupacio(nomLocal, sessio, nEsp);
        VCE.mostrarSeients(fc,nEsp);
    }
    //S'obté el preu dels seients seleccionats i els canvis de moneda i es passen per parametre per  a que es mostrin per pantalla
    public void PrOkSeleccionarSeients (ArrayList<StructFilaColumna> seients){
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        StructPreuCanvis SPC = CCDCE.seleccionarSeients(seients);
        preuP = SPC.getPreu();
        VCE.mostrarPreu(SPC);
    }
    //S'obté el preu convertit a la moneda desitjada per l'usuari
    public void PrConvertir (String moneda) throws serveiNoDisponible{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        Float p = CCDCE.obtePreuMoneda(moneda);
        VCE.mostrarCanvi(p);
    }
    //Es fa el pagament de l'entrada
    public void PrOkComprarEntrada (String dni, Integer codiB, String numCompte) throws serveiNoDisponible, pagamentNoAutoritzat{
        FactoriaCtrlCasosDus FCCD = FactoriaCtrlCasosDus.getInstance();
        CtrlCasDusComprarEntrada CCDCE = FCCD.getCtrlCasDusComprarEntrada();
        CCDCE.pagament(dni, codiB, numCompte);
        VCE.mostrarMissatgeFinal();
    }
}

