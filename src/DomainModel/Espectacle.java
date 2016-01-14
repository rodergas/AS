/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author rober_000
 */
@Entity
public class Espectacle {
    @Id
    private String titol;
    private int participants;
    
    @OneToMany
    private Collection<Representacio> representacions;
    
    public Espectacle(){}
    
    public Espectacle(String titol){
        this.titol = titol;
    }
    
    public Espectacle(String titol, int part,Collection<Representacio> r){
        this.titol = titol;
        participants = part;
        representacions = r;
    }
    
    public Espectacle(String titol, int part){
        this.titol = titol;
        participants = part;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }
    
    public Collection<Representacio> getRepresentacions() {
        return representacions;
    }

    public void setRepresentacions(Collection<Representacio> representacions) {
        this.representacions = representacions;
    }
    
    public ArrayList<StructRepresentacio> consRep(Date data) throws ParseException{
             
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            ArrayList<StructRepresentacio> llrep = new ArrayList<>();
            
            for(Representacio r : representacions){
            String dataAux = sdf.format(r.getData());
            Date dataRep = sdf.parse(dataAux);
                if(dataRep.equals(data)){
                    StructRepresentacio SR = new StructRepresentacio();
                    SR.setNomLocal(r.getCKR().getLocal().getNom());
                    SR.setSessio(r.getCKR().getSessio().getSessio());
                    SR.setNombreSeientsLliure(r.getNombreSeientsLliures());
                    SR.setPreu(r.getPreu());
                    SR.setEstrena(r.esEstrena());
                    llrep.add(SR);
                }
            }
    return llrep;
    }
    
    
    
}
