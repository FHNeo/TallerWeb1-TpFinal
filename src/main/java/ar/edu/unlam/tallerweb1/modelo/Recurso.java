package ar.edu.unlam.tallerweb1.modelo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Recurso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRecurso;	
	private String nombre;	
	private Long cantidad;
	@ManyToMany (fetch = FetchType.LAZY, mappedBy = "recursos")
	private Set<Reserva> reservas = new HashSet <Reserva>();

	public Long getId() {
		return idRecurso;
	}

<<<<<<< HEAD
	public void setId(Long id, Long idRecurso) {
=======
	public void setId(Long idRecurso) {
>>>>>>> a323f788edd4a76c55e0d3c4981c68eb09e3c78b
		this.idRecurso = idRecurso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getCantidad() {
		return cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Recurso [id=" + idRecurso + ", nombre=" + nombre + ", cantidad=" + cantidad + "]";
	}
	
	//RELACION CON RESERVA N A N
	
	public Set<Reserva> getReservas(){
		return this.reservas;
	}
	
	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	
}
