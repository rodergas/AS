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
public class CompoundKeyRepresentacio implements Serializable{
    @ManyToOne
    private Sessio sessio;
    @ManyToOne
    private Local local;
    
    public CompoundKeyRepresentacio(){}
    
    public CompoundKeyRepresentacio(Sessio s, Local l){
        sessio = s;
        local = l;
    }

    /**
     * @return the sessio
     */
    public Sessio getSessio() {
        return sessio;
    }

    /**
     * @param sessio the sessio to set
     */
    public void setSessio(Sessio sessio) {
        this.sessio = sessio;
    }

    /**
     * @return the local
     */
    public Local getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(Local local) {
        this.local = local;
    }
    
}
