/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import Excepcions.noHiHaRepresentacions;
import Excepcions.seientsNoDisp;
import Excepcions.pagamentNoAutoritzat;
import Excepcions.serveiNoDisponible;
import Excepcions.noHiHaEspectacles;
import DomainModel.StructFilaColumna;
import DomainModel.StructPreuCanvis;
import DomainModel.StructRepresentacio;
import Excepcions.seientsNoCoincideixen;
import java.awt.Frame;
import java.util.ArrayList;
import Frames.FinalFrame;
import Frames.LocalSessionFrame;
import Frames.PagamentFrame;
import Frames.TriaEspectaculoFrame;
import Frames.TriaSeientsFrame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author MacBookProAlvaro
 */
public class VistaComprarEntrada {
    //Mostra el frame TriaEspectaculoFrame
    public void mostrarEspectacles (ArrayList<String> titolEsp) {
            new TriaEspectaculoFrame(titolEsp).setVisible(true);
    }
    //Mostra el frame LocalSessionFrame
    public void mostrarRepresentacio (ArrayList<StructRepresentacio> representacions){
                new LocalSessionFrame(representacions).setVisible(true);
    }
    //Mostra el frame TriaSeientsFrame
    public void mostrarSeients (ArrayList<StructFilaColumna> seients){
                new TriaSeientsFrame(seients).setVisible(true);
    }
    //Mostra el frame PagamentFrame
    public void mostrarPreu (StructPreuCanvis SPC){
                new PagamentFrame(SPC).setVisible(true);
    }
    //Mostra el frame PagamentFrame
    public void mostrarCanvi (Float preu){
                new PagamentFrame(preu).setVisible(true);
    }
    //Mostra el frame FinalFrame
    public void mostrarMissatgeFinal (){
                new FinalFrame().setVisible(true);
    }
}
