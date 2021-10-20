package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Distribuicao implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoDistribuicaoDiscente;

	public Distribuicao(Integer codigoDistribuicaoDiscente) {
		super();
		this.codigoDistribuicaoDiscente = codigoDistribuicaoDiscente;
	}
	public Distribuicao() {}

	public Integer getCodigoDistribuicaoDiscente() {
		return codigoDistribuicaoDiscente;
	}

	public void setCodigoDistribuicaoDiscente(Integer codigoDistribuicaoDiscente) {
		this.codigoDistribuicaoDiscente = codigoDistribuicaoDiscente;
	}
	
	
}
