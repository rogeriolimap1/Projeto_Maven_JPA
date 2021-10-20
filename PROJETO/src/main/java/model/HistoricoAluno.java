package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class HistoricoAluno implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codigoHistoricoAluno;
	private String mediaAluno;
	public HistoricoAluno(Integer codigoHistoricoAluno, String mediaAluno) {
		super();
		this.codigoHistoricoAluno = codigoHistoricoAluno;
		this.mediaAluno = mediaAluno;
	}
	public HistoricoAluno() {}
	public Integer getCodigoHistoricoAluno() {
		return codigoHistoricoAluno;
	}
	public void setCodigoHistoricoAluno(Integer codigoHistoricoAluno) {
		this.codigoHistoricoAluno = codigoHistoricoAluno;
	}
	public String getMediaAluno() {
		return mediaAluno;
	}
	public void setMediaAluno(String mediaAluno) {
		this.mediaAluno = mediaAluno;
	}
	
	

}
