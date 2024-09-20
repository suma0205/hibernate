package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Qspider {
	@Id
	private int id;
	private String course;
	private int Studentcount;
	@ManyToMany
	private Employe employe;
	private Trainer trainer;
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
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Qspider() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
