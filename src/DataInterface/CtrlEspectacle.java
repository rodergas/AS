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
    public List<Espectacle> getAll();
    public Espectacle getEspectacle (String titol);
}
