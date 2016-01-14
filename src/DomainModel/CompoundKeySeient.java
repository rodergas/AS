/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author rober_000
 */
@Embeddable
public class CompoundKeySeient implements Serializable{
    @Column(name = "fila")
    private Integer fila;
    @Column(name = "columna")
    private Integer columna;
    @ManyToOne
    //@Column(name = "Nom Local")
    private Local L;
    
    
    public CompoundKeySeient(){}
    
    public CompoundKeySeient(Local loc, Integer row, Integer column){
        L = loc;
        fila = row;
        columna = column;
    }
    
    public Integer getFila(){
        return fila;
    }
    
    public Integer getColumna(){
        return columna;
    }
    
    public Local getLocal(){
        return L;
    }
    
    public void setFila(Integer row){
        fila = row;
    }
    
    public void setColumna(Integer column){
        columna = column;
    }
    
    public void setLocal(Local local){
        this.L = local;
    }

}
