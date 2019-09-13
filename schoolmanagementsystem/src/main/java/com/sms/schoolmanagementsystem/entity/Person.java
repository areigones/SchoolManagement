package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

/**
 * Entity class of a person. 
 * This entity has an id, a user name, a password, a set of marks, a name, a student tutor.
 * This entity will contain all the classes and their respective students.
 * @author JavaAcademy
 *
 */
@Entity
@Table(name = "Person")
public class Person {

	/**
	 * Primary key, auto-generated and auto-incremented.
	 */	
	@Id
	@GeneratedValue
	private long personID;
	
	@NotBlank
	private String username;
	
	@NotBlank
	private String password;
	

	/**
	 * Set of marks of a person.
	 */
	@OneToMany(mappedBy = "personMarks", cascade = CascadeType.ALL)
    private Set<Mark> marks;
	
	@NotBlank
	private String name;
	
	@NonNull
	private String studentResponsible;


	/**
	 * Set of classes of a person.
	 */
	@ManyToOne
	@JoinColumn
	private Sclass personSclasses;

	/**
	 * Default empty constructor
	 */
	public Person() {
		super();
	}
	
	/**
	 * Constructor to create a person.
	 * @param name The name of the person.
	 * @param studentResponsible The tutor of the student.
	 * @param username The user name of the person.
	 * @param password The password of the person.
	 */
	public Person(String name, String studentResponsible, String username, String password) {
		super();
		this.name = name;
		this.studentResponsible = studentResponsible;
		this.username = username;
		this.password = password;
	}

	public long getPersonID() {
		return personID;
	}

	public void setPersonID(long personID) {
		this.personID = personID;
	}


	public Set<Mark> getMarks() {
		return marks;
	}

	public void setMarks(Set<Mark> marks) {
		this.marks = marks;
	}

	public Sclass getPersonSclasses() {
		return personSclasses;
	}

	public void setPersonSclasses(Sclass personSclasses) {
		this.personSclasses = personSclasses;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentResponsible() {
		return studentResponsible;
	}

	public void setStudentResponsible(String studentResponsible) {
		this.studentResponsible = studentResponsible;
	}

	@Override
	public String toString() {
		return "Person [personID=" + personID + ", username=" + username + ", password=" + password + ", marks=" + marks
				+ ", name=" + name + ", studentResponsible=" + studentResponsible + ", personSclasses=" + personSclasses
				+ "]";
	}

	
	

}