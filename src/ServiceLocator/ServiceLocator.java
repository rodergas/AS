/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocator;

import ServiceLocator.BankService;

/**
 *
 * @author rober_000
 */
public class ServiceLocator {
    private static ServiceLocator instance;
    private ServeiCurrencyConvertor SCC;
    private BankService BS;
    //Ens crea una instància de ServiceLocator
    public static ServiceLocator getInstance() {
	if (instance == null)
		instance = new ServiceLocator();
	return instance;
    }
    
    //Ens retorna el servei "ServeiCurrencyConvertor" o "BankService" 
    public Servei find(String name){
        double azar = Math.random();
        if(azar < 0.95){
            if(name.equals("ServeiCurrencyConvertor")){
                if(SCC == null){
                    SCC = new ServeiCurrencyConvertor();
                }
                return SCC;
            }else{
                if(BS == null){
                    BS = new BankService();
                }
                return BS;
            }
        } else return null;
    }
}
