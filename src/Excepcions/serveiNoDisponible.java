/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepcions;

/**
 *
 * @author rober_000
 */
public class serveiNoDisponible extends Exception{
    //Creadora de serveiNoDisponible
    public serveiNoDisponible(){
        super();
    }
    //Creadora de serveiNoDisponible
    public serveiNoDisponible(String message){
        super(message);
    }
}
