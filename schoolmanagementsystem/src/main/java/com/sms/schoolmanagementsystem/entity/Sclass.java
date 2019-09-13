package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Entity class of Sclass. 
 * This entity has an id, a set of persons, a year, a student limit per class, a name, and a set of subjects.
 * This entity will contain all the classes and their respective students.
 * @author JavaAcademy
 *
 */
@Entity
@Table(name = "sclass")
public class Sclass {

	/**
	 * Primary key, auto-generated and auto-incremented.
	 */
	@Id
	@GeneratedValue
	private long sclassID;
	
	/**
	 * Set of persons in a class.
	 */	
	@OneToMany(mappedBy = "personSclasses", cascade = CascadeType.ALL)
    private Set<Person> person;
	
	@NotBlank
	private int year;
	@NotBlank
	private int studentLimit;
	@NotBlank
	private String name;
	
	/**
	 * Set of subjects in a class.
	 */
	@ManyToMany
	@JoinTable(name = "subjects_class",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "sclass_id"))
	private Set<Subjects> classSubjects;

	/**
	 * Default empty constructor
	 */
	public Sclass() {
		super();
	}
	
	/**
	 * Constructor to create a class.
	 * @param year The year of the class.
	 * @param studentLimit The maximum number of students in the class.
	 * @param name The name of the class.
	 */
	public Sclass(int year, int studentLimit, String name) {
		super();
		this.year=year;
		this.studentLimit=studentLimit;
		this.name=name;
	}

	public long getSclassID() {
		return sclassID;
	}

	public void setSclassID(long sclassID) {
		this.sclassID = sclassID;
	}

	public Set<Person> getPerson() {
		return person;
	}

	public void setPerson(Set<Person> person) {
		this.person = person;
	}

	public int getYear() {
		return year;
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

	public Set<Subjects> getClassSubjects() {
		return classSubjects;
	}

	public void setClassSubjects(Set<Subjects> classSubjects) {
		this.classSubjects = classSubjects;
	}

	@Override
	public String toString() {
		return "Sclass [sclassID=" + sclassID + ", person=" + person + ", year=" + year + ", studentLimit="
				+ studentLimit + ", name=" + name + ", classSubjects=" + classSubjects + "]";
	}
	
	
	
	
}