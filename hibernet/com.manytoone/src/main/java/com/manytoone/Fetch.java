package com.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("amy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=manager.find(Student.class, 1);
		System.out.println(student.getId());
		System.out.println(student.getName());
		Subject subject = student.getSubject();
		
		System.out.println(subject.getSubid());
		System.out.println(subject.getName());
	}

}
