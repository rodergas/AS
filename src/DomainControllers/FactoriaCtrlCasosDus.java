/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainControllers;

import DomainControllers.CtrlCasDusConsultarRepresentacio;
import DomainControllers.CtrlCasDusConsultarOcupacio;
import DomainControllers.CtrlCasDusComprarEntrada;

/**
 *
 * @author MacBookProAlvaro
 */
public class FactoriaCtrlCasosDus {
    private static FactoriaCtrlCasosDus instance;

	private CtrlCasDusComprarEntrada CtrlCasDusComprarEntrada;
	private CtrlCasDusConsultarOcupacio CtrlCasDusConsultarOcupacio;
	private CtrlCasDusConsultarRepresentacio CtrlCasDusConsultarRepresentacio;
        //S'obté una instancia de FactoriaCtrlCasosDus i si no existeix, es crea i s'obté
	public static FactoriaCtrlCasosDus getInstance() {
		if (instance == null)
			instance = new FactoriaCtrlCasosDus();
		return instance;
	}
        //S'obté una instancia de CtrlCasDusComprarEntrada i si no existeix, es crea i s'obté
	public CtrlCasDusComprarEntrada getCtrlCasDusComprarEntrada() {
		if (CtrlCasDusComprarEntrada == null)
			CtrlCasDusComprarEntrada = new CtrlCasDusComprarEntrada();
		return CtrlCasDusComprarEntrada;
	}
        //S'obté una instancia de CtrlCasDusConsultarOcupacio i si no existeix, es crea i s'obté
	public CtrlCasDusConsultarOcupacio getCtrlCasDusConsultarOcupacio() {
		if (CtrlCasDusConsultarOcupacio == null)
			CtrlCasDusConsultarOcupacio = new CtrlCasDusConsultarOcupacio();
		return CtrlCasDusConsultarOcupacio;
	}
        //S'obté una instancia de CtrlCasDusConsultarRepresentacio i si no existeix, es crea i s'obté
	public CtrlCasDusConsultarRepresentacio getCtrlCasDusConsultarRepresentacio() {
		if (CtrlCasDusConsultarRepresentacio == null)
			CtrlCasDusConsultarRepresentacio = new CtrlCasDusConsultarRepresentacio();
		return CtrlCasDusConsultarRepresentacio;
	}
}
