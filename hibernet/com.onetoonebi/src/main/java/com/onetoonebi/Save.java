package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
        public static void main(String[] args) {
			EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
			EntityManager manager=factory.createEntityManager();
			EntityTransaction transaction=manager.getTransaction();
			
			Car car=new Car();
			car.setNo(1);
			car.setBrand("Lambo");
			
			Engine engine=new Engine();
			engine.setChNo(101);
			engine.setBrand("Honda");
			
			car.setEngine(engine);
			engine.setCar(car);
			
			transaction.begin();
			manager.persist(car);
			manager.persist(engine);
			transaction.commit();
		}
}
