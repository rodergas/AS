    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author rober_000
 */
@Entity
public class Entrada {
    @Id
    private String identificador;
    private String dniClient;
    private int nombreEspectadors;
    private Date data;
    private float preu;
    
    @ManyToOne 
    private Representacio representacio;
    
    @OneToMany
    private Collection<SeientEnRepresentacio> SER;
    
    public Entrada(){}
    
    public Entrada(String id,String dni, int nombre, Date d, float p, Representacio r, Collection<SeientEnRepresentacio> se){
        this.dniClient = dni;
        this.nombreEspectadors = nombre;
        this.data = d;
        this.preu = p;
        this.representacio = r;
        this.SER = se;
        this.identificador = id;
        representacio.associar(this,this.nombreEspectadors);
        
        ArrayList<SeientEnRepresentacio> AuxSer = new ArrayList<SeientEnRepresentacio>(r.getSER());
        ArrayList<SeientEnRepresentacio> EntradaSer = new ArrayList<SeientEnRepresentacio>(this.SER);
        System.out.println(r.getSER().size());
        System.out.println(EntradaSer.size());
        for(int i = 0; i < AuxSer.size(); ++i){
            SeientEnRepresentacio ii = AuxSer.get(i);
            for(int j = 0; j < this.SER.size();++j){
                System.out.println(EntradaSer.size());
                SeientEnRepresentacio jj = EntradaSer.get(j);
                System.out.println(ii.getCKSER().getSeient().getCKS().getFila() +" " + jj.getCKSER().getSeient().getCKS().getFila());
                
                  if(ii.getCKSER().getSeient().getCKS().getFila().equals(jj.getCKSER().getSeient().getCKS().getFila()) && ii.getCKSER().getSeient().getCKS().getColumna().equals(jj.getCKSER().getSeient().getCKS().getColumna())
                          && ii.getCKSER().getRepresentacio().getCKR().getLocal().getNom().equals(jj.getCKSER().getRepresentacio().getCKR().getLocal().getNom()) && ii.getCKSER().getRepresentacio().getCKR().getSessio().getSessio().toString().equals(jj.getCKSER().getRepresentacio().getCKR().getSessio().getSessio().toString())){  
                    AuxSer.get(i).associar(this);
                }
            }
        }
        r.setSER(AuxSer);
    }
    
    public Entrada(String id){
        identificador  = id;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @param identificador the identificador to set
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    /**
     * @return the dniClient
     */
    public String getDniClient() {
        return dniClient;
    }

    /**
     * @param dniClient the dniClient to set
     */
    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    /**
     * @return the nombreEspectadors
     */
    public int getNombreEspectadors() {
        return nombreEspectadors;
    }

    /**
     * @param nombreEspectadors the nombreEspectadors to set
     */
    public void setNombreEspectadors(int nombreEspectadors) {
        this.nombreEspectadors = nombreEspectadors;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the preu
     */
    public float getPreu() {
        return preu;
    }

    /**
     * @param preu the preu to set
     */
    public void setPreu(float preu) {
        this.preu = preu;
    }

    /**
     * @return the representacio
     */
    public Representacio getRepresentacio() {
        return representacio;
    }

    /**
     * @param representacio the representacio to set
     */
    public void setRepresentacio(Representacio representacio) {
        this.representacio = representacio;
    }

    /**
     * @return the SER
     */
    public Collection<SeientEnRepresentacio> getSER() {
        return SER;
    }

    /**
     * @param SER the SER to set
     */
    public void setSER(Collection<SeientEnRepresentacio> SER) {
        this.SER = SER;
    }
}
