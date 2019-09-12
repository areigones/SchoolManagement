package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "Person")
public class Person {
	@NotBlank
	@GeneratedValue
	private long personID;
	@NotBlank
	private long loginID;
	@NotBlank
	private String fkClass;
	@NotBlank
	private String name;
	@NotBlank
	private String studentResponsible;



	public Person() {
		super();
	}
	
	public Person(long personID, long loginID, String name, String studentResponsible) {
		super();
		this.personID=personID;
		this.loginID=loginID;
		this.name=name;
		this.studentResponsible=studentResponsible;
	}

	public long getPersonID() {
		return personID;
	}

	public void setPersonID(long personID) {
		this.personID = personID;
	}

	public long getLoginID() {
		return loginID;
	}

	public void setLoginID(long loginID) {
		this.loginID = loginID;
	}

	public String getFKClass() {
		return fkClass;
	}

	public void setFKClass(String fkClass) {
		this.fkClass = fkClass;
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

	
}