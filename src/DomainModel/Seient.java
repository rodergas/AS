/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

/**
 *
 * @author rober_000
 */
import DomainModel.CompoundKeySeient;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "SEIENT")
public class Seient {
    @Id
    private CompoundKeySeient CKS;
    
    @OneToMany
    private Collection<SeientEnRepresentacio> SER;
    
    public Seient(){}
    public Seient(int row, int column, Local l){
        this.setCompoundKeySeient(new CompoundKeySeient(l,row,column));
   
    }
    public CompoundKeySeient getCompoundKeySeient(){
        return getCKS();
    }
    
    public void setCompoundKeySeient(CompoundKeySeient compoundKeySeient){
        setCKS(compoundKeySeient);
    }

    /**
     * @return the CKS
     */
    public CompoundKeySeient getCKS() {
        return CKS;
    }

    /**
     * @param CKS the CKS to set
     */
    public void setCKS(CompoundKeySeient CKS) {
        this.CKS = CKS;
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
