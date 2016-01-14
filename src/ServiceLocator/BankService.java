/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceLocator;

import java.util.Date;

/**
 *
 * @author rober_000
 */
public class BankService extends Servei {
    //Funció que autoritza o no el pagament, si no l'autoritza llença una exepció.
    public boolean autoritza(String dni, Integer codiB, String numCompte, float importe, Integer codiBancShows, String numCompteShows, Date data){
        double azar = Math.random();
        return (azar < 0.95);
    } 
}
