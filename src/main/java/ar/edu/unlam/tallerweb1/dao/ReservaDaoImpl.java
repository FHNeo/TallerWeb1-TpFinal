package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.modelo.Reserva;
@Service
@Transactional
public class ReservaDaoImpl implements ReservaDao{
	@Inject
	private SessionFactory sessionFactory;
	@SuppressWarnings("unchecked")
	@Override
	public List<Reserva> traerTodasLasReservas() {
		
		List<Reserva> miReserva = sessionFactory.getCurrentSession().createCriteria(Reserva.class).list();
		return miReserva;
	}
	@Override
	public void guardar(Reserva reserva) {
		sessionFactory.getCurrentSession().save(reserva);		
	}
	

}
