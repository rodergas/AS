/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author rober_000
 */
@Entity
public class Estrena extends Representacio{
    private Integer recarrec;

    /**
     * @return the recarrec
     */
    public Estrena(){}
    
    public Estrena(Sessio s, Local l, float p, int n, Date d,int r){
        super(s,l,p,n,d);
        recarrec = r;
    }
    
    public int getRecarrec() {
        return recarrec;
    }

    /**
     * @param recarrec the recarrec to set
     */
    public void setRecarrec(Integer recarrec) {
        this.recarrec = recarrec;
    }
    
    public boolean esEstrena(){
        return true;
    }
    
}
