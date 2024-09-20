package com.onetomanybi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
  @Id
  private int no;
  private String name;
  @ManyToOne
  private Bank bank;
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Bank getBank() {
	return bank;
}
public void setBank(Bank bank) {
	this.bank = bank;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
  
}
