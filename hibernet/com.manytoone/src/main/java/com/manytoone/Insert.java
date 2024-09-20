package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
    public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("amy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Subject subject=new Subject();
		subject.setSubid(11);
		subject.setName("java");
		
		Student student=new Student();
		student.setId(1);
		student.setName("Gracy");
		student.setSubject(subject);
		
		transaction.begin();
		manager.persist(subject);
		manager.persist(student);
		manager.persist(subject);
		transaction.commit();
		
	}
}
