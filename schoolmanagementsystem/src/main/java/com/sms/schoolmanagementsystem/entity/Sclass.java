package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "sclass")
public class Sclass {
	@Id
	@GeneratedValue
	private long sclassID;
	
	@OneToMany(mappedBy = "personSclasses", cascade = CascadeType.ALL)
    private Set<Person> person;
	
	@NotBlank
	private int year;
	@NotBlank
	private int studentLimit;
	@NotBlank
	private String name;
	
	@ManyToMany
	@JoinTable(name = "subjects_class",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "sclass_id"))
	private Set<Subjects> classSubjects;
	
	public Sclass() {
		super();
	}
	
	/*public Sclass(long fkPersonID, int year, int studentLimit, String name) {
		super();
		this.fkPersonID=fkPersonID;
		this.year=year;
		this.studentLimit=studentLimit;
		this.name=name;
	}*/
	
	
	
	public int getYear() {
		return year;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	public Set<Subjects> getClassSubjects() {
		return classSubjects;
	}

	public void setClassSubjects(Set<Subjects> classSubjects) {
		this.classSubjects = classSubjects;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getStudentLimit() {
		return studentLimit;
	}

	public void setStudentLimit(int studentLimit) {
		this.studentLimit = studentLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSclassID() {
		return sclassID;
	}

	public void setSclassID(long sclassID) {
		this.sclassID = sclassID;
	}

	

	/*public Set<Subjects> getSubjects() {
		return classSubjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.classSubjects = subjects;
	}

	@Override
	public String toString() {
		return "Sclass [sclassID=" + sclassID + ", fkPersonID=" + fkPersonID + ", year=" + year + ", studentLimit="
				+ studentLimit + ", name=" + name + ", subjects=" + classSubjects + "]";
	}*/
	
	
}