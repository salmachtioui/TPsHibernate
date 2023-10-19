/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author hp
 */
@Entity
public class Homme extends Personne { 
     private List<Femme> epouses;
      @OneToMany
     private List<Mariage> mariages;
    public Homme(List<Femme> epouses) {
        this.epouses = epouses;
    }

    //public Homme(List<Femme> epouses, String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
       // super(nom, prenom, telephone, adresse, dateNaissance);
       // this.epouses = epouses;
    //}

    public Homme() {
    }

    public Homme(String nom, String prenom, String telephone, String adresse, Date dateNaissance) {
        super(nom, prenom, telephone, adresse, dateNaissance);
    }

    public List<Femme> getEpouses() {
        return epouses;
    }

    public void setEpouses(List<Femme> epouses) {
        this.epouses = epouses;
    }
    public List<Mariage> getMariages() {
        return mariages;
    }

    public void addMariage(Mariage mariage) {
        this.mariages.add(mariage);
    }
    public List<Mariage> getMariagesEnCours() {
        List<Mariage> mariagesEnCours = new ArrayList<>();

        for (Mariage mariage : mariages) {
            if (mariage.getDateFin() == null) {
                mariagesEnCours.add(mariage);
            }
        }

        return mariagesEnCours;
    }
     public List<Mariage> getMariagesEchoues() {
        List<Mariage> mariagesEchoues = new ArrayList<>();

        for (Mariage mariage : mariages) {
            if (mariage.getDateFin() != null) {
                mariagesEchoues.add(mariage);
            }
        }

        return mariagesEchoues;
    }
      public void ajouterMariage(Mariage mariage) {
        if (mariages == null) {
            mariages = new ArrayList<>();
        }

        mariages.add(mariage);
    }
}
