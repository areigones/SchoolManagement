package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="timetable")
public class Timetable {

	@Id
	@GeneratedValue
	private Long id;
	@NotBlank
	@Basic
	@Temporal(TemporalType.TIME)
	private java.util.Date startTime;
	@NotBlank
	@Basic
	@Temporal(TemporalType.TIME)
	private java.util.Date endTime;
	@NotBlank
	private String dayOfTheWeek;

	@ManyToMany
	@JoinTable(name = "subjects_timetable",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "timetable_id"))
	private Set<Subjects> timetableSubjects;
	
	public Timetable() {
		super();
	}

	/*public Timetable(Long id, java.util.Date startTime, java.util.Date endTime, String subject, String dayOfTheWeek) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.fkSubject = subject;
		this.dayOfTheWeek = dayOfTheWeek;
	}*/

	public Long getId() {
		return id;
	}

	public java.util.Date getStartTime() {
		return startTime;
	}
	public void setStartTime(java.util.Date startTime) {
		this.startTime = startTime;
	}
	public java.util.Date getEndTime() {
		return endTime;
	}
	public void setEndTime(java.util.Date endTime) {
		this.endTime = endTime;
	}
	
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	public Set<Subjects> getTimetableSubjects() {
		return timetableSubjects;
	}

	public void setTimetableSubjects(Set<Subjects> timetableSubjects) {
		this.timetableSubjects = timetableSubjects;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Timetable [id=" + id + ", startTime=" + startTime + ", endTime=" + endTime + ", dayOfTheWeek="
				+ dayOfTheWeek + ", timetableSubjects=" + timetableSubjects + "]";
	}
	
	
}