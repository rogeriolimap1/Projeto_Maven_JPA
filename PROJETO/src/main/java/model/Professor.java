package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Professor implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoProfessor;
	private String nomeProfessor;
	public Professor(Integer codigoProfessor, String nomeProfessor) {
		super();
		this.codigoProfessor = codigoProfessor;
		this.nomeProfessor = nomeProfessor;
	}
	public Professor() {}
	public Integer getCodigoProfessor() {
		return codigoProfessor;
	}
	public void setCodigoProfessor(Integer codigoProfessor) {
		this.codigoProfessor = codigoProfessor;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	

}
