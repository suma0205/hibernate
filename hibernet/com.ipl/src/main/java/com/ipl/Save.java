package com.ipl;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
  public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	Ipl ipl=new Ipl();
	ipl.setNo(1);
	ipl.setName("Virat");
	ipl.setCaption("Rohit");
	ipl.setPrice(45000);
	
	Ipl ipl1=new Ipl();
	ipl1.setNo(2);
	ipl1.setName("Sri Ram");
	ipl1.setCaption("Rohit");
	ipl1.setPrice(40000);
	
	Ipl ipl2=new Ipl();
	ipl2.setNo(3);
	ipl2.setName("Shami");
	ipl2.setCaption("Rohit");
	ipl2.setPrice(45000);
	
	Ipl ipl3=new Ipl();
	ipl3.setNo(4);
	ipl3.setName("Dhoni");
	ipl3.setCaption("Rohit");
	ipl3.setPrice(55000);
	
	Ipl ipl4=new Ipl();
	ipl4.setNo(5);
	ipl4.setName("KL");
	ipl4.setCaption("Rohit");
	ipl4.setPrice(65000);
 // List l=Arrays.asList(ipl,ipl1,ipl2,ipl3,ipl4);
	
	transaction.begin();
    // manager.persist(ipl);
     manager.persist(ipl1);
     manager.persist(ipl2);
     manager.persist(ipl3);
     manager.persist(ipl4);
//     manager.persist(l);
     transaction.commit();
}
}
