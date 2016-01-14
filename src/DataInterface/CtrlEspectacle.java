/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterface;

import DomainModel.Espectacle;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MacBookProAlvaro
 */
public interface CtrlEspectacle {
    /*
    Declaració de la capçalera de la funció getAll() que serà implementada pel CtrlEspectacleDB
    */
    public List<Espectacle> getAll();
    /*
    Declaració de la capçalera de la funció getEspectacle(String titol) 
    que serà implementada pel CtrlEspectacleDB
    */
    public Espectacle getEspectacle (String titol);
}
