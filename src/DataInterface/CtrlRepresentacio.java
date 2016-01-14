/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataInterface;

import DomainModel.Representacio;
import DomainModel.TipusSessio;
import java.util.ArrayList;

/**
 *
 * @author MacBookProAlvaro
 */
public interface CtrlRepresentacio {
    public Representacio getRepresentacio(String nomLocalE, String sessioE);
}
