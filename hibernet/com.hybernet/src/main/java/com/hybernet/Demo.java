package com.hybernet;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Demo {
  public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("gracy");
	System.out.println(factory);
}
}
