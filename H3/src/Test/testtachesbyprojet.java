/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.util.Date;
import ma.projet.classes.Projet;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;

/**
 *
 * @author hp
 */
public class testtachesbyprojet {
    public static void main(String[] args) {
        
        ProjetService ps=new ProjetService();
        //ps.create(new Projet("SmarHouse",new Date(15,10,2023),new Date(15,10,2030)));
        //ps.create(new Projet("ApplicationWeb",new Date(14,10,2023),new Date(14,10,2030)));
        TacheService tse=new TacheService();
       tse.getTachesForProjet(ps.getById(2));
        
        
    }
}
