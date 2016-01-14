/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import DomainModel.CompoundKeyRepresentacio;
import Excepcions.seientsNoDisp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author rober_000
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Representacio {
    @Id
    private CompoundKeyRepresentacio CKR;
    private float preu;
    private int nombreSeientsLliures;
    private Date data;
    
    
    @ManyToOne 
    private Espectacle espectacle;
    
    
    
    @OneToMany
    private Collection<Entrada> entrades;
    
    @OneToMany
    private Collection<SeientEnRepresentacio> SER;
    
    
    public Representacio(){}
    
    public Representacio(Sessio s, Local l){
        this.setCKR(new CompoundKeyRepresentacio(s,l));
    }
    
    public Representacio(Sessio s, Local l, float p, int n, Date d){
        this.setCKR(new CompoundKeyRepresentacio(s,l));
        preu = p;
        nombreSeientsLliures = n;
        data = d;
        entrades = new ArrayList<>();
    }

    /**
     * @return the CKR
     */
    public CompoundKeyRepresentacio getCKR() {
        return CKR;
    }

    /**
     * @param CKR the CKR to set
     */
    public void setCKR(CompoundKeyRepresentacio CKR) {
        this.CKR = CKR;
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
     * @return the nombreSeientsLliures
     */
    public int getNombreSeientsLliures() {
        return nombreSeientsLliures;
    }

    /**
     * @param nombreSeientsLliures the nombreSeientsLliures to set
     */
    public void setNombreSeientsLliures(int nombreSeientsLliures) {
        this.nombreSeientsLliures = nombreSeientsLliures;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the espectacle
     */
    public Espectacle getEspectacle() {
        return espectacle;
    }

    /**
     * @param espectacle the espectacle to set
     */
    public void setEspectacle(Espectacle espectacle) {
        this.espectacle = espectacle;
    }


    public Collection<Entrada> getEntrades() {
        return entrades;
    }

    public void setEntrades(Collection<Entrada> entrades) {
        this.entrades = entrades;
    }


    public Collection<SeientEnRepresentacio> getSER() {
        return SER;
    }


    public void setSER(Collection<SeientEnRepresentacio> SER) {
        this.SER = SER;
    }
    
    public boolean esEstrena(){
        return false;
    }
    /*
    Es retorna la informació(StructFilaColuma)de tots els seients lliure de la representació.
    Si el nombre d'espectadors que ha introduit el usuari es major que els seients lliures de la representacio
    es llençarà una excepció.
    */
    public ArrayList<StructFilaColumna> consOcup(int nEspc)throws seientsNoDisp{
        if(nEspc > this.nombreSeientsLliures) throw new seientsNoDisp("El nombre d'espectadors és més gran que el nombre de seients lliures");
        ArrayList<StructFilaColumna> FilaCol = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> seientsEnRep = new ArrayList<>();
        seientsEnRep = new ArrayList<SeientEnRepresentacio>(this.SER);
        for(int i = 0; i < seientsEnRep.size(); ++i){
            if(seientsEnRep.get(i).getEstat().equals(Estat.lliure)){
                StructFilaColumna fc = new StructFilaColumna(seientsEnRep.get(i).getCKSER().getSeient().getCKS().getFila(),seientsEnRep.get(i).getCKSER().getSeient().getCKS().getColumna());
                FilaCol.add(fc);
            }
        }
        return FilaCol;
    }
    
    public int getRecarrec(){
        return 0;
    }
    
    public void associar(Entrada e, int n){
        entrades.add(e);
        nombreSeientsLliures -= n;
    }
}
