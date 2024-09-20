package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class EmployeP {
	@Id
	private int id;
	private String name;
	private String designation;
	@ManyToOne
	private Pyspider pyspider;
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
	public Pyspider getPyspider() {
		return pyspider;
	}
	public void setPyspider(Pyspider pyspider) {
		this.pyspider = pyspider;
	}
	public EmployeP() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
