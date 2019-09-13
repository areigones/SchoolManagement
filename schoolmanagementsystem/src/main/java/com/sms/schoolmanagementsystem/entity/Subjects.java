package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="subjects")
public class Subjects {

	@Id
	@GeneratedValue
	private Long id;

		
	@ManyToMany(mappedBy = "subjects")
	private Set<Mark> mark;	
	
	
	@ManyToMany(mappedBy = "classSubjects")
	private Set<Sclass> classes;
	
	@NotBlank
	private String nome;
	
	@ManyToMany(mappedBy = "timetableSubjects")
	private Set<Timetable> times;

	public Subjects(){
		super();
	}

	/*public Subjects(Long id, String teacher, String fk_class, String nome) {
		super();
		this.id = id;
		this.fkTeacher = teacher;
		this.fkClass = fk_class;
		this.nome = nome;
	}*/

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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

	/*public Set<Sclass> getClasses() {
		return classes;
	}

	public void setClasses(Set<Sclass> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "Subjects [id=" + id + ", teacher=" + mark + ", classes=" + classes + ", nome=" + nome + ", times="
				+ times + "]";
	}*/

	


}