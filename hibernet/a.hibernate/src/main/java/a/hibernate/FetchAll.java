package a.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("suma");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Query q=manager.createQuery("select s from Student s");
		List<Student>	l=q.getResultList();
		for(Student student:l) {
			System.out.println(student);
		}
	}
}
