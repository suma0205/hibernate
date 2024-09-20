package com.ipl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		

	 List<Ipl> a=manager.createQuery("Select s from Ipl s").getResultList();
	 
	 for(Ipl ipl:a)
	 {
		System.out.println(ipl); 
	 }
	
	}

}
