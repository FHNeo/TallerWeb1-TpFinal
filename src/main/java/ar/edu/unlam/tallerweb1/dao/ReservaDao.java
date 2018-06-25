package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Reserva;

public interface ReservaDao {
	List <Reserva> traerTodasLasReservas();
	void guardar(Reserva reserva);
}
