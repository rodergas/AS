/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DomainModel.Representacio;
import DataInterface.CtrlRepresentacio;
import DataInterface.FactoriaCtrl;
import DomainModel.StructFilaColumna;
import Excepcions.seientsNoDisp;
import java.util.ArrayList;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlCasDusConsultarOcupacio {
    public ArrayList<StructFilaColumna> consultaOcupacio(String nomLocal, String sessio, Integer nombEspectadors) throws seientsNoDisp {
        FactoriaCtrl FC = FactoriaCtrl.getInstance();
        CtrlRepresentacio CR = FC.getCtrlRepresentacio();
        Representacio r = CR.getRepresentacio(nomLocal, sessio);
        ArrayList<StructFilaColumna> seients = r.consOcup(nombEspectadors);
        return seients;
    }
}
