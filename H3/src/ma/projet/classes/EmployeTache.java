/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
@Entity
public class EmployeTache  {
@EmbeddedId
private  EmployeTachePk pk;
@Temporal(javax.persistence.TemporalType.DATE)
@Column(name = "dateDebutReelle", insertable = false, updatable = false)
private Date dateDebutReelle;
 @Temporal(javax.persistence.TemporalType.DATE)
 @Column(name = "dateFinReelle", insertable = false, updatable = false)
private Date  dateFinReelle;
@ManyToOne
@JoinColumn(name="employe")
private Employe employe ;
@ManyToOne
@JoinColumn(name="tache")
private Tache tache;

    public EmployeTache() {
    }

    public EmployeTache(EmployeTachePk pk, Date dateDebutReelle, Date dateFinReelle, Employe employe, Tache tache) {
        this.pk = pk;
        this.dateDebutReelle = dateDebutReelle;
        this.dateFinReelle = dateFinReelle;
        this.employe = employe;
        this.tache = tache;
    }

    public EmployeTachePk getPk() {
        return pk;
    }

    public void setPk(EmployeTachePk pk) {
        this.pk = pk;
    }

    public Date getDateDebutReelle() {
        return dateDebutReelle;
    }

    public void setDateDebutReelle(Date dateDebutReelle) {
        this.dateDebutReelle = dateDebutReelle;
    }

    public Date getDateFinReelle() {
        return dateFinReelle;
    }

    public void setDateFinReelle(Date dateFinReelle) {
        this.dateFinReelle = dateFinReelle;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }
    
}
