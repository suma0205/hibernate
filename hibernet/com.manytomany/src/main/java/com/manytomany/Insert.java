package com.manytomany;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("amy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Buyers buyer=new Buyers(1,"Sam");
	Buyers buyer1=new Buyers(2,"Jam");
	Buyers buyer2=new Buyers(3,"Pam");
	
	List<Buyers> buyers=Arrays.asList(buyer,buyer1,buyer2);
	Brand brand=new Brand(27,"ORM",650,buyers);
	Brand brand1=new Brand(28,"Redlabel",650,buyers);
	Brand brand2=new Brand(29,"BlackndWhite",650,buyers);
	
	transaction.begin();
	manager.persist(buyer);
	manager.persist(buyer1);
	manager.persist(buyer2);
	manager.persist(brand);
	manager.persist(brand1);
	manager.persist(brand2);
	transaction.commit();
	
	
}
}
