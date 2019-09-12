package entity;

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
	private String fkSubject;
	@NotBlank
	private String dayOfTheWeek;
	
	public Timetable() {
		super();
	}
	
	public Timetable(Long id, java.util.Date startTime, java.util.Date endTime, String subject, String dayOfTheWeek) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
		this.fkSubject = subject;
		this.dayOfTheWeek = dayOfTheWeek;
	}
	
	public Long getId() {
		return id;
	}

	public java.util.Date getStartTime() {
		return startTime;
	}
	public void setStartTime(java.util.Date startTime) {
		startTime = startTime;
	}
	public java.util.Date getEndTime() {
		return endTime;
	}
	public void setEndTime(java.util.Date endTime) {
		endTime = endTime;
	}
	public String getSubject() {
		return fkSubject;
	}
	public void setSubject(String subject) {
		fkSubject = subject;
	}
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek) {
		dayOfTheWeek = dayOfTheWeek;
	}
	@Override
	public String toString() {
		return "Timetable [id=" + id + ", StartTime=" + startTime + ", EndTime=" + endTime + ", Subject=" + fkSubject
				+ ", DayOfTheWeek=" + dayOfTheWeek + "]";
	}
}
