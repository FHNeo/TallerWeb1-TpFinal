package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fechaIn;
	private Float monto;
	private Date fechaOut;
	private int lugarReq;

	@ManyToOne
	private Usuario usuario;
	@ManyToOne
	private Establecimiento establecimiento;
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
	public Float getMonto() {
		return monto;
	}
	public void setMonto(Float monto) {
		this.monto = monto;
	}
	public Date getFechaOut() {
		return fechaOut;
	}
	public void setFechaOut(Date fechaOut) {
		this.fechaOut = fechaOut;
	}
	public int getLugarReq() {
		return lugarReq;
	}
	public void setLugarReq(int lugarReq) {
		this.lugarReq = lugarReq;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Establecimiento getEstablecimiento() {
		return establecimiento;
	}
	public void setEstablecimiento(Establecimiento establecimiento) {
		this.establecimiento = establecimiento;
	}
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", fechaIn=" + fechaIn + ", monto=" + monto + ", fechaOut=" + fechaOut
				+ ", lugarReq=" + lugarReq + ", usuario=" + usuario + ", establecimiento=" + establecimiento + "]";
	}
		
	
	
}
