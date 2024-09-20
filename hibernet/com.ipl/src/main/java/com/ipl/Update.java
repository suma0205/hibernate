package com.ipl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Update {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Ipl ipl=manager.find(Ipl.class, 1);
	ipl.setName("King");
	transaction.begin();
	manager.merge(ipl);
	transaction.commit();
	}
}
