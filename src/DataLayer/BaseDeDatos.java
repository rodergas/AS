/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import DomainModel.Representacio;
import DomainModel.Estat;
import DomainModel.Moneda;
import DomainModel.Showscom;
import DomainModel.Espectacle;
import DomainModel.Seient;
import DomainModel.TipusSessio;
import DomainModel.Sessio;
import DomainModel.Local;
import DomainModel.SeientEnRepresentacio;
import DomainModel.Estrena;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author rober_000
 */
public class BaseDeDatos {
    //Creadora buida
    public BaseDeDatos(){}    
    //S'introdueix la informació necessaria per executar el cas d'ús Comprar Entrada
    public void inicializar() throws ParseException{
        Configuration config = new Configuration();
        //config.addAnnotatedClass(Representacio.class);
        config.addAnnotatedClass(Seient.class);
        config.addAnnotatedClass(Local.class);
        
        config.configure("hibernate.cfg.xml");
        
        new SchemaExport(config).create(true, true);
        
        
        StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
        
        SessionFactory factory = config.buildSessionFactory(serviceRegistry);
        Session session = factory.openSession();
        session.beginTransaction();
        
        ArrayList<Seient> s = new ArrayList<>();
        ArrayList<Seient> s2 = new ArrayList<>();
        ArrayList<Seient> s3 = new ArrayList<>();
        ArrayList<Seient> s4 = new ArrayList<>();
        
        Local l = new Local();
        l.setAdreca("Calle Desengaño 21");
        l.setNom("Teatre Tívoli");
        l.setSeients(s);
        
        Local l2 = new Local();
        l2.setAdreca("Calle del Ave del Paraiso 7");
        l2.setNom("Palau Sant Jordi");
        l2.setSeients(s2);
        
        Local l3 = new Local();
        l3.setAdreca("Calle de la Energia 10");
        l3.setNom("Barts");
        l3.setSeients(s3);
        
        Local l4 = new Local();
        l4.setAdreca("Calle Terol 26");
        l4.setNom("Teatreneu");
        l4.setSeients(s4);
        
        session.saveOrUpdate(l);
        session.saveOrUpdate(l2);
        session.saveOrUpdate(l3);
        session.saveOrUpdate(l4);
        
        for(int i = 1; i < 7; ++i){
            for(int j = 1; j < 6; ++j){
                Seient se = new Seient(i,j,l);
                Seient se2 = new Seient(i,j,l2);
                Seient se3 = new Seient(i,j,l3);
                Seient se4 = new Seient(i,j,l4);
                session.saveOrUpdate(se);
                session.saveOrUpdate(se2);
                session.saveOrUpdate(se3);
                session.saveOrUpdate(se4);
                l.setSeient(se);
                //s.add(se);
                l2.setSeient(se2);
                //s2.add(se2);
                l3.setSeient(se3);
                //s3.add(se3);
                l4.setSeient(se4);
            }
        }
        
        
        
        Sessio ses1 = new Sessio(TipusSessio.mati);
        Sessio ses2 = new Sessio(TipusSessio.tarda);
        Sessio ses3 = new Sessio(TipusSessio.nit);
        
        session.saveOrUpdate(ses1);
        session.saveOrUpdate(ses2);
        session.saveOrUpdate(ses3);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("15/1/2016");
        Date d2 = sdf.parse("20/1/2016");
        Date d3 = sdf.parse("27/1/2016");
        Date d4 = sdf.parse("30/1/2016");
        
        Representacio r1 = new Representacio(ses1, l, 7.70f, 30, d1);
        Representacio r2 = new Representacio(ses1, l2, 7.70f, 30, d4);
        Representacio r3 = new Representacio(ses1, l3, 7.70f, 30, d3);
        Representacio r4 = new Representacio(ses2, l, 7.70f, 30, d2);
        Representacio r5 = new Representacio(ses2, l2, 7.70f, 30, d1);
        Representacio r6 = new Representacio(ses2, l3, 7.70f, 30, d4);
        Representacio r7 = new Representacio(ses3, l4, 8.50f, 30, d1);
        
        
        Estrena es1 = new Estrena(ses3, l, 9.70f, 30, d4,1);
        Estrena es2 = new Estrena(ses3, l2, 7.70f, 30, d2,2);
        Estrena es3 = new Estrena(ses3, l3, 7.70f, 30, d1,2);
        
        ArrayList<Representacio> array1 = new ArrayList();
        ArrayList<Representacio> array2 = new ArrayList();
        ArrayList<Representacio> array3 = new ArrayList();
        ArrayList<Representacio> array4 = new ArrayList();
        ArrayList<Representacio> array5 = new ArrayList();
        ArrayList<Representacio> array6 = new ArrayList();
        
        array1.add(r1); array1.add(es1); array1.add(r7); array1.add(es3);
        array2.add(r2);
        array3.add(r3); array3.add(es2); 
        array4.add(r4);
        array5.add(r5);
        array6.add(r6);
        
        Espectacle e1 = new Espectacle("Mamma Mía!",3,array1);
        Espectacle e2 = new Espectacle("El Rey León",5,array2);
        Espectacle e3 = new Espectacle("Grease",7,array3);
        Espectacle e4 = new Espectacle("Los miserables",8,array4);
        Espectacle e5 = new Espectacle("Oliver Twist",9,array5);
        Espectacle e6 = new Espectacle("Cats",2,array6);
        
        r1.setEspectacle(e1);
        r2.setEspectacle(e2);
        r3.setEspectacle(e3);
        r4.setEspectacle(e4);
        r5.setEspectacle(e5);
        r6.setEspectacle(e6);
        r7.setEspectacle(e1);
        
        es1.setEspectacle(e1);
        es2.setEspectacle(e3);
        es3.setEspectacle(e1);
        
        session.saveOrUpdate(e1);
        session.saveOrUpdate(e2);
        session.saveOrUpdate(e3);
        session.saveOrUpdate(e4);
        session.saveOrUpdate(e5);
        session.saveOrUpdate(e6);
        
        /*
        ArrayList<Representacio> ses1Rep = new ArrayList<>();
        ArrayList<Representacio> ses2Rep = new ArrayList<>();
        ArrayList<Representacio> ses3Rep = new ArrayList<>();
        
        ArrayList<Representacio> lRep = new ArrayList<>();
        ArrayList<Representacio> l2Rep = new ArrayList<>();
        ArrayList<Representacio> l3Rep = new ArrayList<>();
        
        ArrayList<Representacio> e1Rep = new ArrayList<>();
        ArrayList<Representacio> e2Rep = new ArrayList<>();
        ArrayList<Representacio> e3Rep = new ArrayList<>();
        ArrayList<Representacio> e4Rep = new ArrayList<>();
        ArrayList<Representacio> e5Rep = new ArrayList<>();
        
        ses1Rep.add(r1); ses1Rep.add(r2); ses1Rep.add(r3);
        ses2Rep.add(r4); ses2Rep.add(r5); ses2Rep.add(r6);
        ses3Rep.add(r7);
        ses1.setRepresentacions(ses1Rep);
        ses2.setRepresentacions(ses2Rep);
        ses3.setRepresentacions(ses3Rep);
        
        lRep.add(r1); lRep.add(r4);
        l2Rep.add(r2); l2Rep.add(r5); l2Rep.add(r7);
        l3Rep.add(r3); l3Rep.add(r6);
        
        l.setRepresentacions(lRep);
        l2.setRepresentacions(l2Rep);
        l3.setRepresentacions(l3Rep);
        
        

        
        ----Faltaria los arrays de espectaculo----
        */

        
        session.saveOrUpdate(r1);
        session.saveOrUpdate(r2);
        session.saveOrUpdate(r3);
        session.saveOrUpdate(r4);
        session.saveOrUpdate(r5);
        session.saveOrUpdate(r6);
        session.saveOrUpdate(r7);

       session.saveOrUpdate(es1);
       session.saveOrUpdate(es2);
       session.saveOrUpdate(es3);
        ArrayList<Moneda> canvis = new ArrayList<>();
        canvis.add(Moneda.GBP);
        canvis.add(Moneda.USD);
        
        Showscom sc = new Showscom(1,323243,"3394500",3.0f,Moneda.EUR,canvis);
        session.saveOrUpdate(sc);
        
        
        ArrayList<SeientEnRepresentacio> SER1 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER2 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER3 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER4 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER5 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER6 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER7 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER8 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER9 = new ArrayList<>();
        ArrayList<SeientEnRepresentacio> SER10 = new ArrayList<>();
        for(int i = 0; i < 5*6; ++i){
                if(s.get(i).getCKS().getLocal().equals(l)){                
                    SeientEnRepresentacio r = new SeientEnRepresentacio(s.get(i),r1,Estat.lliure);
                    session.saveOrUpdate(r);
                    SeientEnRepresentacio rr = new SeientEnRepresentacio(s.get(i),r4,Estat.lliure);
                    session.saveOrUpdate(rr);
                    SeientEnRepresentacio rrr = new SeientEnRepresentacio(s.get(i),es1,Estat.lliure);
                    session.saveOrUpdate(rrr);
                    SER1.add(r);SER2.add(rr); SER3.add(rrr);
                }
                if(s2.get(i).getCKS().getLocal().equals(l2)){
                    SeientEnRepresentacio r11 = new SeientEnRepresentacio(s2.get(i),r2,Estat.lliure);
                    session.saveOrUpdate(r11);
                    SeientEnRepresentacio rr1 = new SeientEnRepresentacio(s2.get(i),r5,Estat.lliure);
                    session.saveOrUpdate(rr1);
                    SeientEnRepresentacio rrr1 = new SeientEnRepresentacio(s2.get(i),es2,Estat.lliure);
                    session.saveOrUpdate(rrr1);
                    SER4.add(r11);SER5.add(rr1); SER6.add(rrr1);
                }
                if(s3.get(i).getCKS().getLocal().equals(l3)){
                    SeientEnRepresentacio r22 = new SeientEnRepresentacio(s3.get(i),r3,Estat.lliure);
                    session.saveOrUpdate(r22);
                    SeientEnRepresentacio rr2 = new SeientEnRepresentacio(s3.get(i),r6,Estat.lliure);
                    session.saveOrUpdate(rr2);
                    SeientEnRepresentacio rr33 = new SeientEnRepresentacio(s3.get(i), es3, Estat.lliure);
                    session.saveOrUpdate(rr33); 
                SER7.add(r22);SER8.add(rr2); SER10.add(rr33);
                } 
                if(s4.get(i).getCKS().getLocal().equals(l4)){
                    SeientEnRepresentacio r33 = new SeientEnRepresentacio(s4.get(i), r7, Estat.lliure);
                    session.saveOrUpdate(r33);

                    SER9.add(r33); 
                }
            r1.setSER(SER1); r4.setSER(SER2); es1.setSER(SER3);
            r2.setSER(SER4); r5.setSER(SER5); es2.setSER(SER6);
            r3.setSER(SER7); r6.setSER(SER8); r7.setSER(SER9);
            es3.setSER(SER10);
            
        session.saveOrUpdate(r1);
        session.saveOrUpdate(r2);
        session.saveOrUpdate(r3);
        session.saveOrUpdate(r4);
        session.saveOrUpdate(r5);
        session.saveOrUpdate(r6);
        session.saveOrUpdate(r7);

       session.saveOrUpdate(es1);
       session.saveOrUpdate(es2);
       session.saveOrUpdate(es3);
            
        }
        
        
        session.getTransaction().commit();
        session.close();
        /*
        System.out.println("GET ADREÇA DEL LOCAL L2: " + l2.getAdreca());
        System.out.println("GET NOM DEL LOCAL L2: " + l2.getNom());
        System.out.println("GET SEIENTS DEL LOCAL L2:");
        Iterator<Seient> it = l2.getSeients().iterator();
        int i = 1;
        while(it.hasNext()){
            System.out.println("Seient " + i);
            Seient s1 = it.next();
            System.out.println("LOCAL DEL SEIENT: " + s1.getCompoundKeySeient().getLocal().getNom() + " FILA: " + s1.getCompoundKeySeient().getFila() + " COLUMNA: " + s1.getCompoundKeySeient().getColumna());
            ++i;
        }*/
        
        }
    
    
}
