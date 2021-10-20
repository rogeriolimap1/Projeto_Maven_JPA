package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoCurso;
	private String nomeCurso;
	private String semestre;
	private String siglaCurso;
	public Curso(Integer codigoCurso, String nomeCurso, String semestre, String siglaCurso) {
		super();
		this.codigoCurso = codigoCurso;
		this.nomeCurso = nomeCurso;
		this.semestre = semestre;
		this.siglaCurso = siglaCurso;
	}
	public Curso() {}
	public Integer getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(Integer codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public String getSiglaCurso() {
		return siglaCurso;
	}
	public void setSiglaCurso(String siglaCurso) {
		this.siglaCurso = siglaCurso;
	}
	
	

}
