package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Sclass")
public class Sclass {
	@NotBlank
	@GeneratedValue
	private long fkPersonID;
	@NotBlank
	private int year;
	@NotBlank
	private int studentLimit;
	@NotBlank
	private String name;
	
	public Sclass() {
		super();
	}
	
	public Sclass(long fkPersonID, int year, int studentLimit, String name) {
		super();
		this.fkPersonID=fkPersonID;
		this.year=year;
		this.studentLimit=studentLimit;
		this.name=name;
	}
	
	public long getFKPersonID() {
		return fkPersonID;
	}
	
	public void setFKPersonID(long fkPersonID) {
		this.fkPersonID=fkPersonID;
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
}
