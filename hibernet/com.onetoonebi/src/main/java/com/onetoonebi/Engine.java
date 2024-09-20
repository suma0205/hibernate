package com.onetoonebi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	private int chNo;
	private String brand;
	@OneToOne
	private Car car;
	public int getChNo() {
		return chNo;
	}
	public void setChNo(int chNo) {
		this.chNo = chNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
