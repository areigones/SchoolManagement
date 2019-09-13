package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="mark")
public class Mark {

	@Id
	@GeneratedValue
	private Long id;	
	
	@ManyToOne
	@JoinColumn
	private Sclass personMarks;
	
	@NotBlank
	private Float grade;

	@ManyToMany
	@JoinTable(name = "subjects_marks",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "mark_id"))
	private Set<Subjects> subjects;
	
	public Mark() {
		super();
	}

	/*public Mark(Long id, String subject, Long personId, Float grade) {
		super();
		this.id = id;
		this.fkSubject = subject;
		fkPersonId = personId;
		this.grade = grade;
	}*/

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public Set<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<Subjects> subjects) {
		this.subjects = subjects;
	}

	
	public Float getGrade() {
		return grade;
	}
	public void setGrade(Float grade) {
		this.grade = grade;
	}

	public Sclass getPersonMarks() {
		return personMarks;
	}

	public void setPersonMarks(Sclass personMarks) {
		this.personMarks = personMarks;
	}

	
	
	


}