package ar.edu.unlam.tallerweb1.modelo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Calificacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long puntaje;
	
	private String comentario;

	@ManyToOne
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(Long puntaje) {
		this.puntaje = puntaje;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Calificacion [id=" + id + ", puntaje=" + puntaje + ", comentario=" + comentario + "]";
	}
	
	
}
