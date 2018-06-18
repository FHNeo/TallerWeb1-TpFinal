package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;

import javax.persistence.ManyToOne;

public class Ocupacion {

	private Long id;
	private Date dia;
	
	@ManyToOne
	private Recurso recurso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Recurso getRecurso() {
		return recurso;
	}

	public void setRecurso(Recurso recurso) {
		this.recurso = recurso;
	}

	@Override
	public String toString() {
		return "Ocupacion [id=" + id + ", dia=" + dia + ", recurso=" + recurso + "]";
	}
	
	
	
}
