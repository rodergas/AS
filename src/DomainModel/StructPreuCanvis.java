/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;

/**
 *
 * @author MacBookProAlvaro
 */
public class StructPreuCanvis {
    private float preu;
    private ArrayList<String> canvis;
    
    public StructPreuCanvis(){}

    public StructPreuCanvis(float p, ArrayList<String> c){
        preu = p;
        canvis = c;
    }
    
    /**
     * @return the preu
     */
    public float getPreu() {
        return preu;
    }

    /**
     * @param preu the preu to set
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     * @return the canvis
     */
    public ArrayList<String> getCanvis() {
        return canvis;
    }

    /**
     * @param canvis the canvis to set
     */
    public void setCanvis(ArrayList<String> canvis) {
        this.canvis = canvis;
    }
    
    
}
