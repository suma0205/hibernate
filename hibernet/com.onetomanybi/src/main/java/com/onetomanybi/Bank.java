package com.onetomanybi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Bank {
  @Id
  private int id;
  private String Name;
  @OneToMany
  private List<Account> account;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public List<Account> getAccount() {
	return account;
}
public void setAccount(List<Account> account) {
	this.account = account;
}
public Bank() {
	super();
	// TODO Auto-generated constructor stub
}

  
}
