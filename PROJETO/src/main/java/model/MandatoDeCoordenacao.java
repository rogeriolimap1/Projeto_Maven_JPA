package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class MandatoDeCoordenacao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoMandatoCoordenacao;
	private String dataInicioMandato;
	private String dataTerminoMandato;
	public MandatoDeCoordenacao(Integer codigoMandatoCoordenacao, String dataInicioMandato, String dataTerminoMandato) {
		super();
		this.codigoMandatoCoordenacao = codigoMandatoCoordenacao;
		this.dataInicioMandato = dataInicioMandato;
		this.dataTerminoMandato = dataTerminoMandato;
	}
	public MandatoDeCoordenacao() {}
	public Integer getCodigoMandatoCoordenacao() {
		return codigoMandatoCoordenacao;
	}
	public void setCodigoMandatoCoordenacao(Integer codigoMandatoCoordenacao) {
		this.codigoMandatoCoordenacao = codigoMandatoCoordenacao;
	}
	public String getDataInicioMandato() {
		return dataInicioMandato;
	}
	public void setDataInicioMandato(String dataInicioMandato) {
		this.dataInicioMandato = dataInicioMandato;
	}
	public String getDataTerminoMandato() {
		return dataTerminoMandato;
	}
	public void setDataTerminoMandato(String dataTerminoMandato) {
		this.dataTerminoMandato = dataTerminoMandato;
	}
	
		
}
