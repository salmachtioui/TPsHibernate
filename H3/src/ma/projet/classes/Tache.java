/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
@Entity
//@NamedNativeQuery(name = "betweenDate", query = "SELECT * FROM  Tache where ( dateFin-dateDebut )BETWEEN :d1 and :d2", resultClass = Tache.class
  @NamedNativeQuery(name = "prixdestachessupque1000dh", query = "SELECT * FROM  Tache where prix>1000", resultClass = Tache.class)
public class Tache  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nom;
    @Temporal(javax.persistence.TemporalType.DATE)
    private  Date dateDebut;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFin;
    private double prix ;
@ManyToOne
    private Projet projet;

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    public Tache() {
    }

    public Tache(String nom, Date dateDebut, Date dateFin, double prix) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}
