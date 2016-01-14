/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import Adapters.ICurrencyConvertorAdapter;

/**
 *
 * @author rober_000
 */
public class FactoriaAdaptadores {
    private static FactoriaAdaptadores instance;

	private ICurrencyConvertorAdapter ICurrencyConvertorAdapter;
	private IBankServiceAdapter IBankServiceAdapter;
        //S'obté una instancia de FactoriaAdaptadores i si no existeix, es crea i s'obté
	public static FactoriaAdaptadores getInstance() {
		if (instance == null)
			instance = new FactoriaAdaptadores();
		return instance;
	}
        //S'obté l'interface IBankServiceAdapter i si no existeix, es crea i s'obté
	public IBankServiceAdapter getBankServiceAdapter() {
		if (IBankServiceAdapter == null)
			IBankServiceAdapter= new BankServiceAdapter();
		return IBankServiceAdapter;
	}
        //S'obté l'interface ICurrencyConvertorAdapter i si no existeix, es crea i s'obté
	public ICurrencyConvertorAdapter getCurrencyConvertorAdapter() {
		if (ICurrencyConvertorAdapter == null)
			ICurrencyConvertorAdapter = new CurrencyConvertorAdapter();
		return ICurrencyConvertorAdapter;
	}

}
