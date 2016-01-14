/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import DomainModel.Moneda;
import Excepcions.serveiNoDisponible;

/**
 *
 * @author rober_000
 */
public interface ICurrencyConvertorAdapter {
    public double obtePreuMoneda(Moneda d, String moneda) throws serveiNoDisponible;
}
