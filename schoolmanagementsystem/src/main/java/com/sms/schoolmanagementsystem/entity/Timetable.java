package com.sms.schoolmanagementsystem.entity;

import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
/**
 * Entity class of Timetable. 
 * This entity has an id, a start time, an end time, a day of the week and a set of subjects that exists in that current time frame.
 * This entity will contain the schedule of the students and professors for every week.
 * @author JavaAcademy
 *
 */
@Entity
@Table(name="timetable")
public class Timetable {

	/**
	 * Primary key, auto-generated and auto-incremented.
	 */
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
	
	/**
	 * Set of subjects.
	 */
	@ManyToMany
	@JoinTable(name = "subjects_timetable",
    joinColumns = @JoinColumn(name = "subjects_id"),
    inverseJoinColumns = @JoinColumn(name = "timetable_id"))
	private Set<Subjects> timetableSubjects;
	
	/**
	 * Default empty constructor
	 */
	public Timetable() {
		super();
	}

	/**
	 * Constructor to schedule a subject.
	 * @param startTime Start time of a subject.
	 * @param endTime End time of a subject.
	 * @param dayOfTheWeek Work day of the week.
	 */
	public Timetable(java.util.Date startTime, java.util.Date endTime, String dayOfTheWeek) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.dayOfTheWeek = dayOfTheWeek;
	}

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