/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DataInterface.CtrlSeientsEnRepresentacio;
import DomainModel.Representacio;
import DomainModel.TipusSessio;
import DomainModel.Seient;
import DomainModel.Sessio;
import DomainModel.SeientEnRepresentacio;
import DomainModel.Local;
import DomainModel.CompoundKeyRepresentacio;
import DomainModel.CompoundKeySeientEnRepresentacio;
import DomainModel.CompoundKeySeient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MacBookProAlvaro
 */
public class CtrlSeientsEnRepresentacioDB implements CtrlSeientsEnRepresentacio {
    /*
    S'accedeix a la base de dades i s'obté el SeientEnRepresentacio
    identifict per la fila "fila", columna "columna, local "nomLocalE" i sessio "sessioE"
    */
    @Override
    public SeientEnRepresentacio getSeientEnRepresentacio(int fila, int columna, String nomLocalE, String sessioE) {
        Configuration config = new Configuration();
       
        config.configure("hibernate.cfg.xml");
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        
        Local l = (Local) session.get(Local.class, nomLocalE);
        Sessio s = (Sessio) session.get(Sessio.class, TipusSessio.valueOf(sessioE));
        
        CompoundKeySeient CKS = new  CompoundKeySeient(l,fila,columna);
        Seient seient = (Seient) session.get(Seient.class, CKS);
        CompoundKeyRepresentacio CKR = new CompoundKeyRepresentacio(s,l);
        Representacio rep = (Representacio) session.get(Representacio.class, CKR);
        CompoundKeySeientEnRepresentacio CKSER = new CompoundKeySeientEnRepresentacio(seient, rep);
        SeientEnRepresentacio SER = (SeientEnRepresentacio) session.get(SeientEnRepresentacio.class, CKSER);
        
        return SER;
    }
   
}
