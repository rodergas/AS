/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import ServiceLocator.ServiceLocator;
import ServiceLocator.BankService;
import Excepcions.serveiNoDisponible;
import java.util.Date;

/**
 *
 * @author rober_000
 */
public class BankServiceAdapter implements IBankServiceAdapter{
    public boolean pagament(String dni, Integer codiB, String numCompte, Float preuE, Integer cb, String nc, Date dAvui) throws serveiNoDisponible{
        ServiceLocator SL = ServiceLocator.getInstance();
        BankService BS = (BankService) SL.find("BankService");
        if(BS == null) throw new serveiNoDisponible("El servei no està disponible");
        else return BS.autoritza(dni, codiB, numCompte, preuE, codiB, numCompte, dAvui);
    }
    
}
