package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Sclass")
public class Sclass {
	@NotBlank
	@GeneratedValue
	private long FKPersonID;
	@NotBlank
	private int year;
	@NotBlank
	private int StudentLimit;
	@NotBlank
	private String name;
	
	public Sclass() {
		super();
	}
	
	public Sclass(long FKPersonID, int year, int StudentLimit, String name) {
		super();
		this.FKPersonID=FKPersonID;
		this.year=year;
		this.StudentLimit=StudentLimit;
		this.name=name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getStudentLimit() {
		return StudentLimit;
	}

	public void setStudentLimit(int StudentLimit) {
		this.StudentLimit = StudentLimit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
