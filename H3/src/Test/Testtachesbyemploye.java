/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Date;
import ma.projet.classes.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.TacheService;

/**
 *
 * @author hp
 */
public class Testtachesbyemploye {
    public static void main(String[] args) {
        TacheService ts=new TacheService();
       // ts.create(new Tache("Développement de l'application web", new Date(2023, 10, 15), new Date(2023, 11, 30), 1500));
       // ts.create(new Tache("Révision du cahier des charges", new Date(2023, 10, 20), new Date(2023, 11, 05), 800.00));
       // ts.create(new Tache("Tests et débogage", new Date(2023, 12, 01), new Date(2023, 12, 20), 1200.00));
        EmployeService es=new EmployeService();
        //ts.getTachesByEmployeId(es.getById(2));
        ts.getTachesByEmployeId(es.getById(1));
    }
}
