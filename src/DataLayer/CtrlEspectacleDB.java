/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataInterface.CtrlEspectacle;
import DomainModel.Espectacle;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlEspectacleDB implements CtrlEspectacle{

    @Override
    public List<Espectacle> getAll() {
        Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        List<Espectacle> l = session.createQuery("from Espectacle").list();
        
        return l;
    }

    @Override
    public Espectacle getEspectacle(String titol) {
                Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        Espectacle e = (Espectacle) session.get(Espectacle.class, titol);
        
        return e;
    }
    
}
