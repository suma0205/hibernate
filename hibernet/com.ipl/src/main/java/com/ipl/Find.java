package com.ipl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Find {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		Ipl ipl1 =manager.find(Ipl.class, 2);
		System.out.println(ipl1);
}
}