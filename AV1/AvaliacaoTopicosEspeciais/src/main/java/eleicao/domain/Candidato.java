package eleicao.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.swing.Spring;

@Entity

public class Candidato implements Serializable{
	
	private static final long serialVersionUID = 449740840175574199L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Spring nomeCandidato;
	private Integer numeroCondidato;
	public Candidato(Integer id, Spring nomeCandidato, Integer numeroCondidato) {
		super();
		this.id = id;
		this.setNomeCandidato(nomeCandidato);
		this.setNumeroCondidato(numeroCondidato);
	}
	public Integer getNumeroCondidato() {
		return numeroCondidato;
	}
	public void setNumeroCondidato(Integer numeroCondidato) {
		this.numeroCondidato = numeroCondidato;
	}
	public Spring getNomeCandidato() {
		return nomeCandidato;
	}
	public void setNomeCandidato(Spring nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nomeCandidato == null) ? 0 : nomeCandidato.hashCode());
		result = prime * result + ((numeroCondidato == null) ? 0 : numeroCondidato.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nomeCandidato == null) {
			if (other.nomeCandidato != null)
				return false;
		} else if (!nomeCandidato.equals(other.nomeCandidato))
			return false;
		if (numeroCondidato == null) {
			if (other.numeroCondidato != null)
				return false;
		} else if (!numeroCondidato.equals(other.numeroCondidato))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nomeCandidato=" + nomeCandidato + ", numeroCondidato=" + numeroCondidato
				+ "]";
	}
	
	
	
}
