package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ar.edu.unlam.tallerweb1.dao.ReservaDao;
import ar.edu.unlam.tallerweb1.modelo.Reserva;

@Service
public class ServicioReservaImpl implements ServicioReserva{
		@Inject
		private ReservaDao ReservaDAO;
		
		@Override
		public List<Reserva> traerLasReservasExistentes(){
			return ReservaDAO.traerTodasLasReservas();
		}

		@Override
		public void registrarReserva(Reserva reserva) {
			ReservaDAO.guardar(reserva);
		}
		
}
