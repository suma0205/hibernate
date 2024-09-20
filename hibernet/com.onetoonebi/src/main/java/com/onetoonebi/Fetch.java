package com.onetoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch {
  public static void main(String[] args) {
	  EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Car car=manager.find(Car.class,1);
		System.out.println(car.getNo());
		System.out.println(car.getBrand());
		
		
		Engine e=car.getEngine();
		System.out.println(e.getChNo());
		System.out.println(e.getBrand());
		
		System.out.println("*********************");
		
		Engine engine=manager.find(Engine.class, 101);
		System.out.println(engine.getChNo());
		System.out.println(engine.getBrand());
		
		Car c=engine.getCar();
		System.out.println(c.getNo());
		System.out.println(c.getBrand());
		
		
}
}
