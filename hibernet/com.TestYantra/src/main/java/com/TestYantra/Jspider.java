package com.TestYantra;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Jspider {
@Id
private int id;
private  String course;
private int Studentcount;
@ManyToMany
private EmployeJ employej;
private TrainerJ trainerj;
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
public EmployeJ getEmployej() {
	return employej;
}
public void setEmployej(EmployeJ employej) {
	this.employej = employej;
}
public TrainerJ getTrainerj() {
	return trainerj;
}
public void setTrainerj(TrainerJ trainerj) {
	this.trainerj = trainerj;
}
public Jspider() {
	super();
	// TODO Auto-generated constructor stub
}

}
