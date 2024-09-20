package com.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Brand {
  @Id
  private int mfgid;
  private String name;
  private int price;
  @ManyToMany
  private List<Buyers> buyers;
public int getMfgid() {
	return mfgid;
}
public void setMfgid(int mfgid) {
	this.mfgid = mfgid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public List<Buyers> getBuyers() {
	return buyers;
}
public void setBuyers(List<Buyers> buyers) {
	this.buyers = buyers;
}
public Brand() {
	super();
	// TODO Auto-generated constructor stub
}
public Brand(int mfgid, String name, int price, List<Buyers> buyers) {
	super();
	this.mfgid = mfgid;
	this.name = name;
	this.price = price;
	this.buyers = buyers;
}
  
}
