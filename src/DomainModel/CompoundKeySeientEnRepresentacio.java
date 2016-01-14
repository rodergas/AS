/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 *
 * @author rober_000
 */
@Embeddable
public class CompoundKeySeientEnRepresentacio implements Serializable {
    @ManyToOne
    private Seient seient;
    @ManyToOne
    private Representacio representacio;
    
    public CompoundKeySeientEnRepresentacio(){}
    
    public CompoundKeySeientEnRepresentacio(Seient s, Representacio r){
        seient = s;
        representacio = r;
    }

    /**
     * @return the seient
     */
    public Seient getSeient() {
        return seient;
    }

    /**
     * @param seient the seient to set
     */
    public void setSeient(Seient seient) {
        this.seient = seient;
    }

    /**
     * @return the representacio
     */
    public Representacio getRepresentacio() {
        return representacio;
    }

    /**
     * @param representacio the representacio to set
     */
    public void setRepresentacio(Representacio representacio) {
        this.representacio = representacio;
    }
    
}
