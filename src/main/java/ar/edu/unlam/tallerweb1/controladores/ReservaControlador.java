package ar.edu.unlam.tallerweb1.controladores;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Reserva;
import ar.edu.unlam.tallerweb1.servicios.ServicioReserva;

@Controller
public class ReservaControlador {

	@Inject
	private ServicioReserva servicioReserva;
	
	@RequestMapping(path="/listaDeReservas", method=RequestMethod.GET)
	//Creo el get para obtener la lista de las reservas y las mando a la vista//
	public ModelAndView traerReservasDisponibles() {
		//Usuario usuario = servicioLogin.consultarUsuario(usuario);
		ModelMap modelo = new ModelMap();
		List<Reserva> reserva = servicioReserva.traerLasReservasExistentes();
		modelo.put("reserva", reserva);
		return new ModelAndView ("reserva",modelo);
	}
	
	@RequestMapping(path="/reservar", method=RequestMethod.GET)
	public ModelAndView irAReservar(){
		ModelMap modelo = new ModelMap();
		return new ModelAndView("FormularioReserva",modelo);
	}
	
	@RequestMapping(path = "/registrarReserva")
	public ModelAndView registrarReserva(@ModelAttribute("reserva") Reserva reserva, HttpServletRequest request){
	 ModelMap modelo = new ModelMap();
	 servicioReserva.registrarReserva(reserva);
	 modelo.put("aviso", "Se ha registrado");
	 return new ModelAndView("confirmacion",modelo);
	}
}
