package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class TrainerJ {
	@Id
	private int id;
	private String name;
	private String designation;
	@ManyToOne
	private Jspider jspider;
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
	public Jspider getJspider() {
		return jspider;
	}
	public void setJspider(Jspider jspider) {
		this.jspider = jspider;
	}
	public TrainerJ() {
		super();
		// TODO Auto-generated constructor stub
	}
   
}
