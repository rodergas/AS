/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapters;

import Excepcions.serveiNoDisponible;
import java.util.Date;

/**
 *
 * @author rober_000
 */
public interface IBankServiceAdapter {
    /*
    Declaració de la capçalera de la funció pagament(String dni, Integer codiB, String numCompte, Float preuE, Integer cb, String nc, Date dAvui)
    que serà implementada pel BankServiceAdapter
    */
    public boolean pagament(String dni, Integer codiB, String numCompte, Float preuE, Integer cb, String nc, Date dAvui) throws serveiNoDisponible;
}
