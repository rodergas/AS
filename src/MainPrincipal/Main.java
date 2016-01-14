/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPrincipal;

import Frames.PrimeroFrame;
import DataLayer.BaseDeDatos;
import PresentationLayer.CtrlVistaComprarEntrada;
import DomainModel.Espectacle;
import java.text.ParseException;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alex
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        if(!inicialitzat()){
            BaseDeDatos bd = new BaseDeDatos();
            bd.inicializar();
        }
        PrimeroFrame primeroframe = new PrimeroFrame();
        primeroframe.setVisible(true);
        CtrlVistaComprarEntrada CVCE = new CtrlVistaComprarEntrada();
        //PrimeroFrame a = new PrimeroFrame();
        //a.setVisible(true);
       
    }
    
    public static boolean inicialitzat(){
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        Query q = session.createQuery("Select Count(*) From Espectacle");
        int numero = ((Number) q.uniqueResult()).intValue();
        if (numero == 0) return false;
        else return true;
        
        //List<Espectacle> l = session.createQuery("from Espectacle").list();
        //if (l.size()==0) return false;
        //else return true;
        
    }
    
}
