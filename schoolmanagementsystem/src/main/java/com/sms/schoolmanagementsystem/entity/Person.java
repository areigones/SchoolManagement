package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Person")
public class Person {
	@Id
	//@NotBlank
	@GeneratedValue
	private long personID;
	
	
//	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
//	private Login login;
	
	private String username;
	
	private String password;
	
	@OneToMany(mappedBy = "personMarks", cascade = CascadeType.ALL)
    private Set<Mark> marks;
	
	//@NotBlank
	private String name;
	
	//@NotBlank
	private String studentResponsible;

	 @ManyToOne
	 @JoinColumn
	 private Sclass personSclasses;

	public Person() {
		super();
	}
	
	public Person(String name, String studentResponsible, String username, String password) {
		super();
//		this.personID=personID;
//		this.marks = marks;
		this.name = name;
		this.studentResponsible = studentResponsible;
		this.username = username;
		this.password = password;
//		this.personSclasses = personSclasses;
	}

	public long getPersonID() {
		return personID;
	}

	public void setPersonID(long personID) {
		this.personID = personID;
	}

//	public Login getLoginID() {
//		return login;
//	}
//
//	public void setLoginID(Login loginID) {
//		this.login = loginID;
//	}
//
//	
//	public Login getLogin() {
//		return login;
//	}
//
//	public void setLogin(Login login) {
//		this.login = login;
//	}

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