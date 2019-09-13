package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Entity class of Subjects. 
 * This entity has an id, a set of marks, a set of classes, a name and a set of times.
 * This entity will contain the subjects available in a class.
 * @author JavaAcademy
 *
 */
@Entity
@Table(name="subjects")
public class Subjects {

	/**
	 * Primary key, auto-generated and auto-incremented.
	 */
	@Id
	@GeneratedValue
	private Long id;

	/**
	 * Set of marks of a subject.
	 */
	@ManyToMany(mappedBy = "subjects")
	private Set<Mark> mark;	
	
	/**
	 * Set of classes available.
	 */	
	@ManyToMany(mappedBy = "classSubjects")
	private Set<Sclass> classes;
	
	@NotBlank
	private String name;
	
	/**
	 * Set of timetables of a subject.
	 */
	@ManyToMany(mappedBy = "timetableSubjects")
	private Set<Timetable> times;

	/**
	 * Default empty constructor
	 */
	public Subjects(){
		super();
	}

	/**
	 * Constructor to create a subject.
	 * @param name Name of the subject.
	 */
	public Subjects(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Set<Sclass> getClasses() {
		return classes;
	}

	public void setClasses(Set<Sclass> classes) {
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Timetable> getTimes() {
		return times;
	}

	public void setTimes(Set<Timetable> times) {
		this.times = times;
	}

	public Set<Mark> getMark() {
		return mark;
	}

	public void setMark(Set<Mark> mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", mark=" + mark + ", classes=" + classes + ", name=" + name + ", times=" + times
				+ "]";
	}



	


}