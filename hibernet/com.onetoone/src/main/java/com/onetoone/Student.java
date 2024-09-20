package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int roll;
	private String name;
	@OneToOne
	private Laptop latop;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Laptop getLatop() {
		return latop;
	}
	public void setLatop(Laptop latop) {
		this.latop = latop;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
