package ar.edu.unlam.tallerweb1.controladores;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unlam.tallerweb1.modelo.Reserva;

@Controller
@RequestMapping(value="/reserva")
@SessionAttributes({"reserva", "sede"})
public class ReservaControlador {

	@RequestMapping(method=RequestMethod.GET)
	//Creo el get para obtener la lista de las reservas y las mando a la vista//
	public ModelAndView index(Model model) {
		ModelMap modelo = new ModelMap();
		List<Reserva> reserva = new ArrayList<Reserva>();
		modelo.put("reserva", reserva);
		return new ModelAndView ("reserva",modelo);
		
		
	}
	




}
