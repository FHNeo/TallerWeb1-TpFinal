package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Reserva {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReserva;
	private Date fechaIn;
	private Date fechaOut;
	private Long CantPersona;
	private boolean tipo;
	
	/*Se declara el tipo de relacion y se hace el join de las dos tablas, aclarando
	  cuales seran las fk que tendra la tabla intermedia y como se llamara*/
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "reserva_sala", catalog = "db", joinColumns = {
			@JoinColumn(name = "idReserva", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "idSala", nullable = false, 
			updatable = false)})
	private Set<Sala> salas = new HashSet<Sala>();
	

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "reserva_recurso", catalog = "db", joinColumns = {
			@JoinColumn(name = "idReserva", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "idRecurso", nullable = false, 
			updatable = false)})
	private Set<Recurso> recursos = new HashSet<Recurso>();

	public Reserva() {
	}

	public Long getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Long idReserva) {
		this.idReserva = idReserva;
	}
	
	public Date getFechaIn() {
		return fechaIn;
	}
	public void setFechaIn(Date fechaIn) {
		this.fechaIn = fechaIn;
	}
	
	public Date getFechaOut() {
		return fechaOut;
	}
	public void setFechaOut(Date fechaOut) {
		this.fechaOut = fechaOut;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Long getCantPersona() {
		return CantPersona;
	}
	public void setCantPersona(Long cantPersona) {
		this.CantPersona = cantPersona;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + idReserva + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut + ", CantPersona=" + CantPersona
				+ ", tipo=" + tipo + ", usuario=" + usuario + "]";
	}
	
	// Humanize de Tipo//
	//Esto lo pongo para que no de True o False, si no algo leible
	public String HumanizeTipo() {
		String tipoHumanizado = "Privada";
		if (this.tipo = false)
			tipoHumanizado = "Compartida";
		return tipoHumanizado;
		
	}
	
	// **** RELACIONES **** //
	
	@ManyToOne
	private Usuario usuario;
	
	// RELACION N A N CON SALA
	
	public Set<Sala> getSalas(){
		return this.salas;
	}
	
	public void setSalas(Set<Sala> salas) {
		this.salas = salas;
	}
	
	//RELACION N A N CON RECURSO
	
	public Set<Recurso> getRecursos(){
		return this.recursos;
	}
	
	public void setRecursos(Set<Recurso> recursos) {
		this.recursos = recursos;
	}
}