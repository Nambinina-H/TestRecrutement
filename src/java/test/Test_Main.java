package test;
import util.HibernateUtil;
import model.CoursModel;

public class Test_Main{
	
	public static void main(String[] args) {
                CoursModel pm = new CoursModel();
                pm.ajouterCours(1, "CRUD avec JSP et Hibernate", "Contenu...", "Web");
		HibernateUtil.sessionFactory.close();
	}
}