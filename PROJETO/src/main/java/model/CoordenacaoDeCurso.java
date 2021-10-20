package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CoordenacaoDeCurso implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoCoordenacao;
	private String emailCoordenacao;
	private String telefoneCoordenacao;
	public CoordenacaoDeCurso(Integer codigoCoordenacao, String emailCoordenacao, String telefoneCoordenacao) {
		super();
		this.codigoCoordenacao = codigoCoordenacao;
		this.emailCoordenacao = emailCoordenacao;
		this.telefoneCoordenacao = telefoneCoordenacao;
	}
	public CoordenacaoDeCurso() {}
	public Integer getCodigoCoordenacao() {
		return codigoCoordenacao;
	}
	public void setCodigoCoordenacao(Integer codigoCoordenacao) {
		this.codigoCoordenacao = codigoCoordenacao;
	}
	public String getEmailCoordenacao() {
		return emailCoordenacao;
	}
	public void setEmailCoordenacao(String emailCoordenacao) {
		this.emailCoordenacao = emailCoordenacao;
	}
	public String getTelefoneCoordenacao() {
		return telefoneCoordenacao;
	}
	public void setTelefoneCoordenacao(String telefoneCoordenacao) {
		this.telefoneCoordenacao = telefoneCoordenacao;
	}
	
	

}
