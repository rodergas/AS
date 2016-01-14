/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DomainModel.Espectacle;
import DataInterface.CtrlEspectacle;
import DataInterface.FactoriaCtrl;
import DomainModel.StructRepresentacio;
import Excepcions.noHiHaEspectacles;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlCasDusConsultarRepresentacio {
    /*
    El CtrlCasDusConsultarRepresentacio cridarà al CtrlEspectacle, el qual li haurà de 
    retornar els titols dels espectacles que hi ha a la base de dades.
    Si no en retorna cap, llença una exepció.
    */
    public ArrayList<String> consultaEspectacles() throws noHiHaEspectacles{
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        CtrlEspectacle CE = FC.getCtrlEspectacle();
        List<Espectacle> espectacles = CE.getAll();
        if(espectacles.size() == 0) throw new noHiHaEspectacles("No hi ha espectacles");
        ArrayList<String> titols = new ArrayList<String>();
        for (int i = 0; i < espectacles.size(); ++i){
            titols.add(espectacles.get(i).getTitol());
        }
        return titols;
    }
    /*
    El CtrlCasDusConsultarRepresentacio cridarà al CtrlEspectacle, el qual li haurà de 
    retornar tota la informació(StructRepresentacio) de les representacions de l'espectacle 
    amb titol "titol" a la data "data".
    */
    public ArrayList<StructRepresentacio> consultaRepresentacions(String titol, Date data) throws ParseException {
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        CtrlEspectacle CE = FC.getCtrlEspectacle();
        Espectacle e = CE.getEspectacle(titol);
        ArrayList<StructRepresentacio> representacions = e.consRep(data);
        return representacions;
    }
}
