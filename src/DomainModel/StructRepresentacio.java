/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import DomainModel.TipusSessio;

/**
 *
 * @author rober_000
 */
public class StructRepresentacio {
    private String nomLocal;
    private TipusSessio sessio;
    private int nombreSeientsLliure;
    private boolean estrena;
    private float preu;

    public StructRepresentacio(){}
    /**
     * @return the nomLocal
     */
    public String getNomLocal() {
        return nomLocal;
    }

    /**
     * @param nomLocal the nomLocal to set
     */
    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    /**
     * @return the sessio
     */
    public TipusSessio getSessio() {
        return sessio;
    }

    /**
     * @param sessio the sessio to set
     */
    public void setSessio(TipusSessio sessio) {
        this.sessio = sessio;
    }

    /**
     * @return the nombreSeientsLliure
     */
    public int getNombreSeientsLliure() {
        return nombreSeientsLliure;
    }

    /**
     * @param nombreSeientsLliure the nombreSeientsLliure to set
     */
    public void setNombreSeientsLliure(int nombreSeientsLliure) {
        this.nombreSeientsLliure = nombreSeientsLliure;
    }

    /**
     * @return the estrena
     */
    public boolean isEstrena() {
        return estrena;
    }

    /**
     * @param estrena the estrena to set
     */
    public void setEstrena(boolean estrena) {
        this.estrena = estrena;
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
    
    
}
