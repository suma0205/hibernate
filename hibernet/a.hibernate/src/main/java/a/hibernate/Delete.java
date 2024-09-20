package a.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("suma");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Student student=manager.find(Student.class, 5);
		transaction.begin();
		manager.remove(student);
		transaction.commit();
	}
}
