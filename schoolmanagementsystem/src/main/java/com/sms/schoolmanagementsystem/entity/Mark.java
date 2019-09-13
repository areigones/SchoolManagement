package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * Entity class of a mark. 
 * This entity has an id, a grade, a set of subjects.
 * This entity will contain a students mark of a specific subject.
 * @author JavaAcademy
 *
 */
@Entity
@Table(name="mark")
public class Mark {

	/**
	 * Primary key, auto-generated and auto-incremented.
	 */	
	@Id
	@GeneratedValue
	private Long id;	
	
	/**
	 * Mark's Person.
	 */	
	@ManyToOne
	@JoinColumn
	private Person personMarks;
	
	@NotBlank
	private Float grade;

	/**
	 * Set of subjects.
	 */
	@ManyToMany
	@JoinTable(name = "subjects_marks",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "mark_id"))
	private Set<Subjects> subjects;

	/**
	 * Default empty constructor
	 */
	public Mark() {
		super();
	}

	/**
	 * Constructor to create a mark.
	 * @param grade The mark of a student in a subject.
	 */
	public Mark(Float grade) {
		super();
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPersonMarks() {
		return personMarks;
	}

	public void setPersonMarks(Person personMarks) {
		this.personMarks = personMarks;
	}

	public Float getGrade() {
		return grade;
	}

	public void setGrade(Float grade) {
		this.grade = grade;
	}

	public Set<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Mark [id=" + id + ", personMarks=" + personMarks + ", grade=" + grade + ", subjects=" + subjects + "]";
	}

	

	
	
	


}