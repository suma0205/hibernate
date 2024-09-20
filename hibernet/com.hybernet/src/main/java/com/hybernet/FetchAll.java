package com.hybernet;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAll {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();

		Query query=manager.createQuery("Select s from Student1 s");
		List<Student1> a=query.getResultList();
		for(Student1 student:a) {
			System.out.println(student);
		}
	}
}
