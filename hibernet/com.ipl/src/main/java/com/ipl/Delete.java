package com.ipl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Delete {
	public static void main(String[] args) {
		
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	  Ipl ipl3=manager.find(Ipl.class, 1);
	   transaction.begin();
	   manager.remove(ipl3);
	   transaction.commit();
}
}
