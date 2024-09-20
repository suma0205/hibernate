package com.onetomanybi;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
   public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("amy");
	EntityManager manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Bank bank=new Bank();
	bank.setId(1);
	bank.setName("HDFC");
	
	Account account=new Account();
	account.setNo(1234);
	account.setName("Gracy");
	account.setBank(bank);
	
	Account a1=new Account();
	a1.setNo(4567);
	a1.setName("Amulya");
	a1.setBank(bank);
	
	
	Account a2=new Account();
	a2.setNo(9876);
	a2.setName("Beryl");
	a2.setBank(bank);
	
	bank.setAccount(Arrays.asList(account,a1,a2));
	
	transaction.begin();
	manager.persist(account);
	manager.persist(a1);
	manager.persist(a2);
	manager.persist(bank);
	transaction.commit();
}
}
