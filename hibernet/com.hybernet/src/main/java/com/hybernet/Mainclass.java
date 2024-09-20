package com.hybernet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
   public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Student1 student=new Student1();
	student.setNo(1);
	student.setName("garcy");
	student.setEmail("gracy123@gmail.com");
	student.setNumber(345678987654l);
	
	transaction.begin();
	manager.persist(student);
	transaction.commit();
	
}
}
