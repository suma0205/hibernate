package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Trainer {
@Id
private int id;
private String name;
private String designation;
@ManyToOne
private Qspider qspider;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public Qspider getQspider() {
	return qspider;
}
public void setQspider(Qspider qspider) {
	this.qspider = qspider;
}
public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}

}
