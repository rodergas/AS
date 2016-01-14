/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import Adapters.ICurrencyConvertorAdapter;
import ServiceLocator.ServeiCurrencyConvertor;
import ServiceLocator.ServiceLocator;
import DomainModel.Moneda;
import Excepcions.serveiNoDisponible;

/**
 *
 * @author rober_000
 */
public class CurrencyConvertorAdapter implements ICurrencyConvertorAdapter {
    /*
    El CurrencyConvertorAdapter cridarà al ServiceLocator el qual retornarà el
    ServeiCurrencyConvertor i amb aquest servei s'obtindrà el ratio.
    Si no s'ha aconseguit retornar el servei, és llençarà una excepció.
    */
    @Override
    public double obtePreuMoneda(Moneda d, String moneda) throws serveiNoDisponible{
        ServiceLocator SL = ServiceLocator.getInstance();
        double ratio = 0.0;
        ServeiCurrencyConvertor SCC = (ServeiCurrencyConvertor) SL.find("ServeiCurrencyConvertor");
        if(SCC == null) throw new serveiNoDisponible("El servei no està disponible");
        else ratio = SCC.conversionRate(d, moneda);
        return ratio;
    }
}
