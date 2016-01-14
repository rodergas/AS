/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterface;

import DataInterface.CtrlEspectacle;
import DataLayer.CtrlEspectacleDB;
import DataLayer.CtrlRepresentacioDB;
import DataLayer.CtrlSeientsEnRepresentacioDB;

/**
 *
 * @author MacBookProAlvaro
 */
public class FactoriaCtrl {
    private static FactoriaCtrl instance;

	private CtrlEspectacle CtrlEspectacle;
	private CtrlRepresentacio CtrlRepresentacio;
	private CtrlSeientsEnRepresentacio CtrlSeientsEnRepresentacio;
        //S'obté una instancia de FactoriaCtrl i si no existeix, es crea i s'obté
	public static FactoriaCtrl getInstance() {
		if (instance == null)
			instance = new FactoriaCtrl();
		return instance;
	}
        //S'obté l'interface CtrlEspectacle i si no existeix, es crea i s'obté
	public CtrlEspectacle getCtrlEspectacle() {
		if (CtrlEspectacle == null)
			CtrlEspectacle = new CtrlEspectacleDB();
		return CtrlEspectacle;
	}
        //S'obté l'interface CtrlRepresentacio i si no existeix, es crea i s'obté
	public CtrlRepresentacio getCtrlRepresentacio() {
		if (CtrlRepresentacio == null)
			CtrlRepresentacio = new CtrlRepresentacioDB();
		return CtrlRepresentacio;
	}
        //S'obté l'interface CtrlSeientsEnRepresentacio i si no existeix, es crea i s'obté
	public CtrlSeientsEnRepresentacio getCtrlSeientsEnRepresentacio() {
		if (CtrlSeientsEnRepresentacio == null)
			CtrlSeientsEnRepresentacio = new CtrlSeientsEnRepresentacioDB();
		return CtrlSeientsEnRepresentacio;
	}
}
