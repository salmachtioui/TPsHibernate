/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import ma.projet.service.EmployeService;
import ma.projet.service.ProjetService;

/**
 *
 * @author hp
 */
public class Testproduitbyemploye {
    public static void main(String[] args) {
        EmployeService es=new EmployeService();
        ProjetService ps=new ProjetService();
      ps.getProjetsByEmployeId(es.getById(1));
     
    }
}
