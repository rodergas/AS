/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import DomainModel.CompoundKeySeientEnRepresentacio;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rober_000
 */
@Entity
public class SeientEnRepresentacio  {
    @Id
    private CompoundKeySeientEnRepresentacio CKSER;
    
    @Enumerated(EnumType.STRING)
    private Estat estat;
    
    @ManyToOne
    private Entrada entrada;
    
    public SeientEnRepresentacio(){}
    
    public SeientEnRepresentacio(Seient s, Representacio r, Estat e){
         this.setCKSER(new CompoundKeySeientEnRepresentacio(s,r));
         estat = e;
    }

    /**
     * @return the CKSER
     */
    public CompoundKeySeientEnRepresentacio getCKSER() {
        return CKSER;
    }

    /**
     * @param CKSER the CKSER to set
     */
    public void setCKSER(CompoundKeySeientEnRepresentacio CKSER) {
        this.CKSER = CKSER;
    }

    /**
     * @return the estat
     */
    public Estat getEstat() {
        return estat;
    }

    /**
     * @param estat the estat to set
     */
    public void setEstat(Estat estat) {
        this.estat = estat;
    }

    /**
     * @return the entrada
     */
    public Entrada getEntrada() {
        return entrada;
    }

    /**
     * @param entrada the entrada to set
     */
    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }
    
    public void associar(Entrada e){
        entrada = e;
        this.estat = Estat.ocupat;
        
    }
    
}
