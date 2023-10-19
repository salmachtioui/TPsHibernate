/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;

/**
 *
 * @author hp
 */
public class MariagePk  implements Serializable {
private int Homme ;
private int Femme;
private Date dateDebut;
private Date dateFin;
private int nbrEnfant;

    public MariagePk() {
    }

    public MariagePk(int Homme, int Femme, Date dateDebut, Date dateFin, int nbrEnfant) {
        this.Homme = Homme;
        this.Femme = Femme;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.nbrEnfant = nbrEnfant;
    }

    public int getHomme() {
        return Homme;
    }

    public void setHomme(int Homme) {
        this.Homme = Homme;
    }

    public int getFemme() {
        return Femme;
    }

    public void setFemme(int Femme) {
        this.Femme = Femme;
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

    public int getNbrEnfant() {
        return nbrEnfant;
    }

    public void setNbrEnfant(int nbrEnfant) {
        this.nbrEnfant = nbrEnfant;
    }

}
