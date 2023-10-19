/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import ma.projet.beans.Femme;
import ma.projet.beans.Homme;
import ma.projet.beans.Mariage;
import ma.projet.dao.IDao;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author hp
 */
public class HommeService implements IDao<Homme> {

    @Override
    public boolean create(Homme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean delete(Homme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public boolean update(Homme o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return false;
    }

    @Override
    public Homme findById(int id) {
        Homme Homme = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Homme = (Homme) session.get(Homme.class, id);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return Homme;
    }

    @Override
    public List<Homme> findAll() {
        List<Homme> Hommes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            Hommes = session.createQuery("from Homme").list();
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null)
                tx.rollback();
        } finally {
            if(session != null)
                session.close();
        }
        return Hommes;
    }

    // ...

    public List<Femme> getEpousesEntreDates(Homme homme, Date dateDebut, Date dateFin) {
        Session session = null;
        try  {
            session = HibernateUtil.getSessionFactory().openSession();
            String hql = "SELECT m.femme " +
                    "FROM Mariage m " +
                    "WHERE m.homme = :homme " +
                    "AND m.dateMariage BETWEEN :dateDebut AND :dateFin";
            Query query = session.getNamedQuery("Femme.getEpousesEntreDates");
    
            query.setParameter("homme", homme);
            query.setParameter("dateDebut", dateDebut);
            query.setParameter("dateFin", dateFin);
            return query.list();
        } catch (Exception e) {
            // Gérer les exceptions
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
  

    public void afficherMariagesHomme(Homme homme) {
        System.out.println("Nom : " + homme.getNom() + " " + homme.getPrenom());
        List<Mariage> mariagesEnCours = homme.getMariagesEnCours();
        System.out.println("Mariages En Cours :");
        afficherMariages(mariagesEnCours);
        List<Mariage> mariagesEchoues = homme.getMariagesEchoues();
        System.out.println("Mariages échoués :");
        afficherMariages(mariagesEchoues);
    }

    private void afficherMariages(List<Mariage> mariages) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for (int i = 0; i < mariages.size(); i++) {
            Mariage mariage = mariages.get(i);
            Femme femme = mariage.getFemme();
            String dateDebut = dateFormat.format(mariage.getDateDebut());
            String dateFin = (mariage.getDateFin() != null) ? dateFormat.format(mariage.getDateFin()) : "En cours";
            int nbrEnfants = mariage.getNbrEnfant();

            System.out.println((i + 1) + ". Femme : " + femme.getNom() + " " + femme.getPrenom() +
                    " Date Début : " + dateDebut + " Date Fin : " + dateFin +
                    " Nbr Enfants : " + nbrEnfants);
        }
    }
}

     

    
