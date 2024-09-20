package a.hibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("suma");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		Principal principal=new Principal();
		principal.setId(1);
		principal.setName("abc");

		College college=new College();
		college.setId(1);
		college.setName("gecr");

		principal.setCollege(college);

		transaction.begin();
		manager.persist(college);
		manager.persist(principal);
		transaction.commit();
	}
}
