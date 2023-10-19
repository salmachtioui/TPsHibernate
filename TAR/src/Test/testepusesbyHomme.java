/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import static ma.projet.beans.Mariage_.dateDebut;
import static ma.projet.beans.Mariage_.dateFin;
import static ma.projet.beans.Mariage_.homme;
import ma.projet.services.FemmeService;
import ma.projet.services.HommeService;

/**
 *
 * @author hp
 */
public class testepusesbyHomme {
    public static void main(String[] args) {
        HommeService hs=new HommeService();
        FemmeService fs=new FemmeService();
        hs.create(new Homme("Tahiri", "Ahmed", "0623995577", "Rabat", new Date(1993,11,01)));
       hs.create(new Homme("kadiri", "Achraf", "0623995533", "Salé", new Date(1992,05,01)));
     // hs.create(new Homme("Risani", "Omar", "06239955513", "Casa", new Date(1996,04,01)));
       // hs.create(new Homme("Chtioui", "Zaher", "062399239", "Dakhla", new Date(1994,19,01)));
       // hs.create(new Homme("Rasi", "Nadir", "062399495", "Guelmim", new Date(1997,02,01)));
       // fs.create(new Femme("Anderson", "Emma", "666555444", "456 Pine Rd", new Date(1975, 6, 17)));
       // fs.create(new Femme("Brown", "Zoe", "999888777", "852 Elm St", new Date(1987, 4, 5)));
       // fs.create(new Femme("Miller", "Sophia", "111222333", "654 Oakwood Ave", new Date(1992, 11, 30)));
       // fs.create(new Femme("Wilson", "Ava", "888888888", "987 Willow Dr", new Date(1983, 9, 22)));
       // fs.create(new Femme("Clark", "Olivia", "555555555", "321 Birch Blvd", new Date(1988, 7, 7)));
        fs.create(new Femme("Davis", "Grace", "123789456", "789 Cedar Ln", new Date(1995, 1, 10)));
       // fs.create(new Femme("Brown", "Laura", "444789123", "456 Pine Rd", new Date(1977, 3, 18)));
       // fs.create(new Femme("Taylor", "Sophie", "555123456", "789 Maple Ave", new Date(1980, 12, 3)));
       // fs.create(new Femme("Johnson", "Emma", "987654321", "5678 Oak St", new Date(1990, 8, 25)));
       // fs.create(new Femme("Smith", "Alice", "123456789", "1234 Elm St", new Date(1985, 5, 15))); 
        Date dateDebut=new Date(2020,01,05);
        Date dateFin=new Date(2023,10,16);
        List<Femme> epouses = hs.getEpousesEntreDates(new Homme("Tahiri", "Ahmed", "0623995577", "Rabat", new Date(1993,11,01)) , dateDebut, dateFin);
       for (Femme femme : epouses) {
            System.out.println(femme);
        } 
    }
}
