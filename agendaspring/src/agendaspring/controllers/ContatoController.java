package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import models.Contato;

@Controller
public class ContatoController {

	@RequestMapping("/contatos/formulario")
	public String formulario() {
		System.out.println("Chamou o formulario de contatos");
		return "contatos/formulario";
	}
	
	@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		return "contatos/ok";
	}
}
