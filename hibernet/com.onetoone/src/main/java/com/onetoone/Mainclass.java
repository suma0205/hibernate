package com.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
    public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student student=new Student();
		student.setRoll(1);
		student.setName("Gracy");
		
		Laptop laptop=new Laptop();
		laptop.setIp(123456);
		laptop.setBrand("hp");
		laptop.setCost(50000);
		 
		student.setLatop(laptop);
		
		transaction.begin();
		manager.persist(student);
		manager.persist(laptop);
		transaction.commit();
	}
}
