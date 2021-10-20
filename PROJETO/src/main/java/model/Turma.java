package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Turma implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoDeTurma;
	private String sigla;
	private Integer ano;
	public Turma(Integer codigoDeTurma, String sigla, Integer ano) {
		super();
		this.codigoDeTurma = codigoDeTurma;
		this.sigla = sigla;
		this.ano = ano;
	}
	public Turma() {}
	public Integer getCodigoDeTurma() {
		return codigoDeTurma;
	}
	public void setCodigoDeTurma(Integer codigoDeTurma) {
		this.codigoDeTurma = codigoDeTurma;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}

	
}
