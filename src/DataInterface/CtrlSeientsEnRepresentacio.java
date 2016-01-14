/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterface;

import DomainModel.Espectacle;
import DomainModel.SeientEnRepresentacio;
import DomainModel.TipusSessio;
import java.util.ArrayList;

/**
 *
 * @author MacBookProAlvaro
 */
public interface CtrlSeientsEnRepresentacio {
        /*
    Declaració de la capçalera de la funció getSeientEnRepresentacio(int fila, int columna, String nomLocalE, String sessioE)
    que serà implementada pel CtrlSeientsEnRepresentacioDB
    */
    public SeientEnRepresentacio getSeientEnRepresentacio(int fila, int columna, String nomLocalE, String sessioE);
}
