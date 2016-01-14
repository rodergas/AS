/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocator;

import DomainModel.Moneda;

/**
 *
 * @author rober_000
 */
public class ServeiCurrencyConvertor extends Servei{
    //Ens retorna el ratio de EUR a USD o GBP
    public double conversionRate(Moneda divisa, String moneda){
        String euro = divisa.toString();
        
        double ratio = 0.0;
        if(moneda.equals(Moneda.USD.toString())){
            ratio = 1.09; //Euro to USD 10/1/2016 
        }else if(moneda.equals(Moneda.GBP.toString())){
            ratio = 0.75; //Euro to GBP 10/1/2016 
        }
        return ratio;
    }
    
}
