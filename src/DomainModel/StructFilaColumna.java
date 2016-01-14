/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author rober_000
 */
public class StructFilaColumna {
    private Integer fila;
    private Integer columna;
    
    public StructFilaColumna(){}
    
    public StructFilaColumna(int f, int c){
        fila = f;
        columna = c;
    }

    /**
     * @return the fila
     */
    public Integer getFila() {
        return fila;
    }

    /**
     * @param fila the fila to set
     */
    public void setFila(Integer fila) {
        this.fila = fila;
    }

    /**
     * @return the columna
     */
    public Integer getColumna() {
        return columna;
    }

    /**
     * @param columna the columna to set
     */
    public void setColumna(Integer columna) {
        this.columna = columna;
    }
}
