package com.empoyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("amulya");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Stude employee=manager.find(Employee.class, 1);
		System.out.println(employee);
		
		

}
}
