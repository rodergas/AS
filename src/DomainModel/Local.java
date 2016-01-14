/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.OneToMany;
/**
 *
 * @author rober_000
 */
@Entity
@Table(name = "LOCAL")
public class Local {
    @Id
    private String nom;
    @Column(name = "Adreça")
    private String adreca;
    @OneToMany
    @JoinColumn(name = "Seients")
    private Collection<Seient> seients;
    
    @OneToMany
    private Collection<Representacio> representacions;
    
    public Local(){}
    public Local(String name){
        nom = name;
    }
    
    public Local(String name,String address,Collection<Seient> s){
        nom = name;
        adreca = address;
        seients = s;

    }
    
    
    public String getNom(){
        return nom;
    }
    
    public String getAdreca(){
        return adreca;
    }
    
    
    public void setNom(String name){
        nom = name;
    }
    
    public void setAdreca(String address){
        adreca = address;
    }
    
    public void setSeients(Collection<Seient> s){
        seients = s;
    }
    
    public void setSeient(Seient s){
        getSeients().add(s);
    }

    /**
     * @return the seients
     */
    public Collection<Seient> getSeients() {
        return seients;
    }

    /**
     * @return the representacions
     */
    public Collection<Representacio> getRepresentacions() {
        return representacions;
    }

    /**
     * @param representacions the representacions to set
     */
    public void setRepresentacions(Collection<Representacio> representacions) {
        this.representacions = representacions;
    }

}
