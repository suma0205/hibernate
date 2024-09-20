package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Pyspider {
	@Id
	private int id;
	private  String course;
	private int Studentcount;
	@ManyToMany
	private EmployeP employep;
	private TrainerP trainerp;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getStudentcount() {
		return Studentcount;
	}
	public void setStudentcount(int studentcount) {
		Studentcount = studentcount;
	}
	public EmployeP getEmployep() {
		return employep;
	}
	public void setEmployep(EmployeP employep) {
		this.employep = employep;
	}
	public TrainerP getTrainerp() {
		return trainerp;
	}
	public void setTrainerp(TrainerP trainerp) {
		this.trainerp = trainerp;
	}
	public Pyspider() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
