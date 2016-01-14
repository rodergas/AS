/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Showscom {
    @Id
    private int id;

    private int codiBanc;
    private String numeroCompte;
    private float comissio;

    @Enumerated(EnumType.STRING)
    private Moneda divisa;
    @Column
    @ElementCollection(targetClass=Moneda.class)
    @Enumerated(EnumType.STRING)
    private Collection<Moneda> canvis;
    
    private static Showscom instance;
    
    public Showscom(){}
    
    public Showscom(final int id,final int codiBanc,final String numeroCompte,final float comissio,final Moneda divisa, final Collection<Moneda> canvis){
        this.id = id;
        this.codiBanc = codiBanc;
        this.numeroCompte = numeroCompte;
        this.comissio = comissio;
        this.divisa = divisa;
        this.canvis = canvis;
        //instance = this;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the codiBanc
     */
    public int getCodiBanc() {
        return codiBanc;
    }

    /**
     * @param codiBanc the codiBanc to set
     */
    public void setCodiBanc(int codiBanc) {
        this.codiBanc = codiBanc;
    }

    /**
     * @return the numeroCompte
     */
    public String getNumeroCompte() {
        return numeroCompte;
    }

    /**
     * @param numeroCompte the numeroCompte to set
     */
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    /**
     * @return the comissio
     */
    public float getComissio() {
        return comissio;
    }

    /**
     * @param comissio the comissio to set
     */
    public void setComissio(float comissio) {
        this.comissio = comissio;
    }

    /**
     * @return the divisa
     */
    public Moneda getDivisa() {
        return divisa;
    }

    /**
     * @param divisa the divisa to set
     */
    public void setDivisa(Moneda divisa) {
        this.divisa = divisa;
    }

    /**
     * @return the canvis
     */
    public Collection<Moneda> getCanvis() {
        return canvis;
    }

    /**
     * @param canvis the canvis to set
     */
    public void setCanvis(Collection<Moneda> canvis) {
        this.canvis = canvis;
    }
    
    public static Showscom getInstance(){
        if(instance == null){
            Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();

            SessionFactory factory = config.buildSessionFactory(serviceRegistry);
            Session session = factory.openSession();

            instance =(Showscom) session.get(Showscom.class,1);
        }
        return instance;
    }
}
