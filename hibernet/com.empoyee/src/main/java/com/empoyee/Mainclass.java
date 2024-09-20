package com.empoyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass {
	
		   public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("amulya");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			
			Employee emplyee=new Employee();
			emplyee.setId(1);
			emplyee.setName("garcy");
			emplyee.setSal(340000);
			emplyee.setEmail("gracy123@gmail.com");
			
			transaction.begin();
			manager.persist(emplyee);
			transaction.commit();
			
		}
		}


