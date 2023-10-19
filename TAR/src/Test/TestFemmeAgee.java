/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;

public class TestFemmeAgee {
    public static void main(String[] args) {
        List<Femme> femmes = new ArrayList<>();
      
        Femme femmePlusAgee =searchFemmePlusAgee(femmes);
        if (femmePlusAgee != null) {
            System.out.println("La femme la plus âgée est : " + femmePlusAgee.getNom() +
                    ", âgée de " + femmePlusAgee.calculAge() + " ans.");
        } else {
            System.out.println("Aucune femme existe");
        }
    }

    public static Femme searchFemmePlusAgee(List<Femme> femmes) {
        if (femmes.isEmpty()) {
            return null;
        }

        Femme femmePlusAgee = femmes.get(0);
        for (Femme femme : femmes) {
            if (femme.calculAge() > femmePlusAgee.calculAge()) {
                femmePlusAgee = femme;
            }
        }

        return femmePlusAgee;
    }
}

  
 
