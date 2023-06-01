package aulajpa.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Curso implements Serializable {
	public Curso() {

	}

	

	public Curso(Integer idcurso, String nomecurso) {
		super();
		this.idcurso = idcurso;
		this.nomecurso = nomecurso;
	}



	@Override
	public String toString() {
		return "Curso [idcurso=" + idcurso + ", nomecurso=" + nomecurso + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(idcurso, nomecurso);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		return Objects.equals(idcurso, other.idcurso) && Objects.equals(nomecurso, other.nomecurso);
	}



	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getNomecurso() {
		return nomecurso;
	}

	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}



	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcurso;

	@Column(name = "nomecurso", nullable = false)
	private String nomecurso;

}
