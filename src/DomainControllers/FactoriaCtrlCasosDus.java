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

	public static FactoriaCtrlCasosDus getInstance() {
		if (instance == null)
			instance = new FactoriaCtrlCasosDus();
		return instance;
	}

	public CtrlCasDusComprarEntrada getCtrlCasDusComprarEntrada() {
		if (CtrlCasDusComprarEntrada == null)
			CtrlCasDusComprarEntrada = new CtrlCasDusComprarEntrada();
		return CtrlCasDusComprarEntrada;
	}

	public CtrlCasDusConsultarOcupacio getCtrlCasDusConsultarOcupacio() {
		if (CtrlCasDusConsultarOcupacio == null)
			CtrlCasDusConsultarOcupacio = new CtrlCasDusConsultarOcupacio();
		return CtrlCasDusConsultarOcupacio;
	}

	public CtrlCasDusConsultarRepresentacio getCtrlCasDusConsultarRepresentacio() {
		if (CtrlCasDusConsultarRepresentacio == null)
			CtrlCasDusConsultarRepresentacio = new CtrlCasDusConsultarRepresentacio();
		return CtrlCasDusConsultarRepresentacio;
	}
}
