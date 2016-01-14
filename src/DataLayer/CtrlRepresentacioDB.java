/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataInterface.CtrlRepresentacio;
import DomainModel.Representacio;
import DomainModel.TipusSessio;
import DomainModel.Sessio;
import DomainModel.Local;
import DomainModel.CompoundKeyRepresentacio;
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
public class CtrlRepresentacioDB implements CtrlRepresentacio {

    @Override
    public Representacio getRepresentacio(String nomLocalE, String ses) {
         Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        Local l = (Local) session.get(Local.class, nomLocalE);
        Sessio s = (Sessio) session.get(Sessio.class, TipusSessio.valueOf(ses));
        
        CompoundKeyRepresentacio CKR = new CompoundKeyRepresentacio(s, l);
        Representacio r = (Representacio) session.get(Representacio.class, CKR);
        
        return r;
        
    }
    
}
