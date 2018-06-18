package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fechaIn;
	private Date fechaOut;
	private int CantPersona;
	private boolean tipo;

	@ManyToOne
	private Usuario usuario;
	
	//@ManyToMany
	//RELACION CON SALA
	
	//@ManyToMany
	//RELACION CON RECURSO

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	
	public int getCantPersona() {
		return CantPersona;
	}
	public void setCantPersona(int cantPersona) {
		CantPersona = cantPersona;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut + ", CantPersona=" + CantPersona
				+ ", tipo=" + tipo + ", usuario=" + usuario + "]";
	}

	
	
	
	
}
