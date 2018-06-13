package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.modelo.Reserva;
@Service
public class ReservaDaoImpl implements ReservaDao{
	@Inject
	private SessionFactory sessionFactory;

	@Override
	public List<Reserva> traerReserva() {
		List<Reserva> miReserva = sessionFactory.getCurrentSession().createCriteria(Reserva.class).list();
		return miReserva;
	}

}
