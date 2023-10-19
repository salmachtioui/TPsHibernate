/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import ma.projet.entity.Produit;
import java.util.Date;
import ma.projet.service.ProduitService;
import org.hibernate.Hibernate;
import util.HibernateUtil;


public class TestProduit {
public static void main(String[] args) {
  ProduitService ps = new ProduitService();
  //ps.create(new Produit("Samsung","ABC123",new Date(2023,10,05),"Téléphone portable Galaxy S20"));
     // ps.create(new Produit("Apple","LMK123",new Date(2023,10,07),"Ordinateur portable MacBook Air"));
      //ps.create(new Produit("Sony","GHI789",new Date(2023,10,9),"Casque audio sans fil WH-1000XM4"));
      // ps.create(new Produit("Nikon","JKL012",new Date(2023,10,10),"Appareil photo reflex numérique D850"));
        // ps.create(new Produit("HP","MNO345",new Date(2023,10,11),"Imprimante laser couleur LaserJet Pro MFP M281fdw"));
         // Produit  p = ps.findById(12);
          // System.out.println(p);
  //Supprimer le produit dont id = 13
        // Produit  p = ps.findById(13);
           // ps.delete(p);
  //Modifier les informations du produit dont id = 11,methode1
  //Produit p = ps.findById(11);
  //p.setPrix(95);
     // p.setDateAchat(new Date(2023,10,18));
      //p.setDesignation("Robe");
      //p.setMarque("ZARA");
     // p.setReference("KA123");
 // ps.update(p);
   // System.out.println(p);
   //Modifier les informations du produit dont id = 11,methode2
   //Produit pt = ps.findById(11);
      //  if (pt != null) {
           // pt.setMarque("HP");
           // pt.setReference("MMMPPP");
            //pt.setDateAchat(new Date("2015/09/08"));
           // pt.setPrix(5000);
            //pt.setDesignation("PC HP");
            //ps.update(pt);
        }
  //for(Produit p : ps.findAll())
     // if(p.getId()<15)
           // System.out.println(p);

      //Afficher la liste des produits dont le prix est sup à 100 DH
        //for (Produit p : ps.findAll()) {
            //if (p.getPrix() > 100) {
               // System.out.println("" + p.getMarque());
           // }
   // return null;
        
//}
}
     
