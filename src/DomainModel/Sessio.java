/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 *
 * @author rober_000
 */
@Entity
public class Sessio {
    @Id
    @Enumerated(EnumType.STRING)
    private TipusSessio sessio;
    
    @OneToMany
    private Collection<Representacio> representacions;
    
    public Sessio(){}
    
    public Sessio(TipusSessio sessio){
        this.sessio = sessio;
    }
    
    public TipusSessio getSessio(){
        return sessio;
    }
    
    public void setSessio(TipusSessio sessio){
        this.sessio = sessio;
    }
    
    public void setRepresentacions(Collection<Representacio> r){
        representacions = r;
    }
    
    public Collection<Representacio> getRepresentacions(){
        return representacions;
    }
    
}
