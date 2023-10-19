
package ma.projet.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
@Entity
 @NamedNativeQuery(name = "prixdesproduitssupque1000dh", query = "SELECT * FROM  Produit where prix>1000", resultClass = Produit.class)
@Table(name="Produits")
public class Produit  {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double prix;
     private String marque;
     private String reference;
    @Temporal(javax.persistence.TemporalType.DATE)
     private Date dateAchat ;
     private String designation;

    public Produit() {
    }

    public Produit( String marque,double prix, String reference, Date dateAchat, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.designation = designation;
        this.prix=prix;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", dateAchat=" + dateAchat + ", designation=" + designation +", prix=" + prix+ '}';
    }

    public Produit(int id, double prix, String marque, String reference, Date dateAchat, String designation) {
        this.id = id;
        this.prix = prix;
        this.marque = marque;
        this.reference = reference;
        this.dateAchat = dateAchat;
        this.designation = designation;
    }

   

    

    
    
    
    
    
    
    
    }

   
    

