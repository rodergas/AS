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
public class pagamentNoAutoritzat extends Exception{
    //Creadora de pagamentNoAutoritzat
    public pagamentNoAutoritzat(){
        super();
    }
    //Creadora de pagamentNoAutoritzat
    public pagamentNoAutoritzat(String message){
        super(message);
    }
}
