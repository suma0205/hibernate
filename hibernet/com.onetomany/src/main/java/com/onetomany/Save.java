package com.onetomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Student student=new Student();
		student.setId(1);
		student.setName("Leetu");
		
		Laptop laptop=new Laptop();
		laptop.setIp(2342);
		laptop.setBrand("DELL");
		laptop.setCost(50000);
		
		Laptop laptop1=new Laptop();
		laptop1.setIp(201);
		laptop1.setBrand("DELL");
		laptop1.setCost(60000);
		
		ArrayList<Laptop> laptops=new ArrayList<Laptop>();
		laptops.add(laptop);
		laptops.add(laptop1);
		
		transaction.begin();
		manager.persist(student);
		manager.persist(laptop);
		manager.persist(laptop1);
		transaction.commit();
		
		
		
		
		
		
	}

}