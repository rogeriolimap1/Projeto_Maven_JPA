package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Aluno implements Serializable{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoAluno;
	private String nome;
	private String dataDeNascimento;
	private String sexo;
	
	public Aluno(Integer codigoAluno, String nome, String dataDeNascimento, String sexo) {
		super();
		this.codigoAluno = codigoAluno;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
	}	
	
	public Aluno () { }
	
	public Integer getCodigoAluno() {
		return codigoAluno;
	}
	public void setCodigoAluno(Integer codigoAluno) {
		this.codigoAluno = codigoAluno;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
