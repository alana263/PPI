package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homeAlgo() {
		System.out.println("Chamou o m�todo homeAlgo!");
		return "home";
	}
}
