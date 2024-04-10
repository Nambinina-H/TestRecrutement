package model;


import org.hibernate.Session;

import bean.Cours;

import util.HibernateUtil;


public class CoursModel{
    
        public void ajouterCours(int codecours, String Titre, String Contenu, String Categorie){
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            Cours c = new Cours();
            c.setCodecours(codecours);
            c.setTitre(Titre);
            c.setContenu(Contenu);
            c.setCategorie(Categorie);
            session.save(c);
            session.beginTransaction().commit();
        }
}