/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author hp
 */
@Embeddable
public class EmployeTachePk implements Serializable {
private int Employe ;
private int Tache;
private Date dateDebutReelle;
private Date  dateFinReelle;

    public EmployeTachePk() {
    }

    public EmployeTachePk(int Employe, int Tache, Date dateDebutReelle, Date dateFinReelle) {
        this.Employe = Employe;
        this.Tache = Tache;
        this.dateDebutReelle = dateDebutReelle;
        this.dateFinReelle = dateFinReelle;
    }

    public int getEmploye() {
        return Employe;
    }

    public void setEmploye(int Employe) {
        this.Employe = Employe;
    }

    public int getTache() {
        return Tache;
    }

    public void setTache(int Tache) {
        this.Tache = Tache;
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

}
