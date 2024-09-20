package a.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("suma");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=manager.find(Student.class, 4);
		student.setName("Baby");
		transaction.begin();
		manager.merge(student);
		transaction.commit();
	}
	
}
