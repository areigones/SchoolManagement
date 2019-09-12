package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="mark")
public class Mark {

	@Id
	@GeneratedValue
	private Long id;
	@NotBlank
	private String fkSubject;
	@NotBlank
	private Long fkPersonId;
	@NotBlank
	private Float grade;

	public Mark() {
		super();
	}

	public Mark(Long id, String subject, Long personId, Float grade) {
		super();
		this.id = id;
		this.fkSubject = subject;
		fkPersonId = personId;
		this.grade = grade;
	}

	public String getSubject() {
		return fkSubject;
	}
	public void setSubject(String subject) {
		this.fkSubject = subject;
	}
	public Long getPersonId() {
		return fkPersonId;
	}
	public void setPersonId(Long personId) {
		fkPersonId = personId;
	}
	public Float getGrade() {
		return grade;
	}
	public void setGrade(Float grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Mark [subject=" + fkSubject + ", PersonId=" + fkPersonId + ", grade=" + grade + "]";
	}



}