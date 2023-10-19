/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import ma.projet.classes.Tache;
import ma.projet.service.TacheService;

/**
 *
 * @author hp
 */
public class TestdesTaches {
    public static void main(String[] args) {
        TacheService ts=new TacheService();
        // ts.create(new Tache("Développement de l'application web", new Date(2023, 10, 15), new Date(2023, 11, 30), 1500));
       // ts.create(new Tache("Révision du cahier des charges", new Date(2023, 10, 20), new Date(2023, 11, 05), 800.00));
       // ts.create(new Tache("Tests et débogage", new Date(2023, 12, 01), new Date(2023, 12, 20), 1200.00));
        // for(Tache tache : ts.findBetweenDate(new Date("2021,01,01"), new Date("2023,01/01"))){
         //  System.out.println(tache.getNom());

SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy,MM,dd");

try {
    Date d1 = dateFormat.parse("2020,01,01");
    Date d2 = dateFormat.parse("2024,01,01");
    List<Tache> taches = ts.findBetweenDate(d1, d2);
    for(Tache tache :taches)
        System.out.println(tache.getNom()); 
} catch (ParseException e) {
    System.err.println("Erreur lors de l'analyse de la date : " + e.getMessage());
}    
    }
    }
