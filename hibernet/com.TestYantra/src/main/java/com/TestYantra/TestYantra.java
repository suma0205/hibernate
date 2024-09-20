package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TestYantra {
	@Id
	private int id;
	private String name;
	private String designation;
	@OneToMany
	private Qspider qspider;
	private Jspider jspider;
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
	public Qspider getQspider() {
		return qspider;
	}
	public void setQspider(Qspider qspider) {
		this.qspider = qspider;
	}
	public Jspider getJspider() {
		return jspider;
	}
	public void setJspider(Jspider jspider) {
		this.jspider = jspider;
	}
	public Pyspider getPyspider() {
		return pyspider;
	}
	public void setPyspider(Pyspider pyspider) {
		this.pyspider = pyspider;
	}
	public TestYantra() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TestYantra(int id, String name, String designation, Qspider qspider, Jspider jspider, Pyspider pyspider) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.qspider = qspider;
		this.jspider = jspider;
		this.pyspider = pyspider;
	}
//	@Override
//	public String toString() {
//		return "TestYantra [id=" + id + ", name=" + name + ", designation=" + designation + ", qspider=" + qspider
//				+ ", jspider=" + jspider + ", pyspider=" + pyspider + "]";
//	}
	

}
