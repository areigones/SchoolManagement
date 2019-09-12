package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Person")
public class Person {
	@NotBlank
	@GeneratedValue
	private long PersonID;
	@NotBlank
	private long LoginID;
	@NotBlank
	private String FKClass;
	@NotBlank
	private String name;
	@NotBlank
	private String StudentResponsible;



	public Person() {
		super();
	}
	
	public Person(long PersonID, long LoginID, String name, String StudentResponsible) {
		super();
		this.PersonID=PersonID;
		this.LoginID=LoginID;
		this.name=name;
		this.StudentResponsible=StudentResponsible;
	}

	public long getPersonID() {
		return PersonID;
	}

	public void setPersonID(long personID) {
		PersonID = personID;
	}

	public long getLoginID() {
		return LoginID;
	}

	public void setLoginID(long loginID) {
		LoginID = loginID;
	}

	public String getFKClass() {
		return FKClass;
	}

	public void setFKClass(String FKClass) {
		this.FKClass = FKClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentResponsible() {
		return StudentResponsible;
	}

	public void setStudentResponsible(String StudentResponsible) {
		this.StudentResponsible = StudentResponsible;
	}

	
}