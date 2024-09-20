package com.empoyee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("amulya");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee employee=manager.find(Employee.class, 1);
		employee.setName("joseph");
		transaction.begin();
		manager.merge(employee);
		transaction.commit();

}
}
