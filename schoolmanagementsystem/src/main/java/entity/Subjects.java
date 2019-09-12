package entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="subjects")
public class Subjects {

	@Id
	@GeneratedValue
	private Long id;
	
	@NotBlank
	private String fkTeacher;
	@NotBlank
	private String fkClass;
	@NotBlank
	private String nome;
	
	public Subjects(){
		super();
	}
	
	public Subjects(Long id, String teacher, String fk_class, String nome) {
		super();
		this.id = id;
		this.fkTeacher = teacher;
		this.fkClass = fk_class;
		this.nome = nome;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTeacher() {
		return fkTeacher;
	}
	public void setTeacher(String teacher) {
		this.fkTeacher = teacher;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Subjects [id=" + id + ", teacher=" + fkTeacher + ", nome=" + nome + "]";
	}
	
	
}
