package agendaspring.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dao.ContatoDAO;
import models.Contato;

@Controller
public class ContatoController {

	@RequestMapping("/contatos/formulario")
	public String formulario() {
		System.out.println("Chamou o formulario de contatos");
		return "contatos/formulario";
	}

	@PostMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println(contato);
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserir(contato);
		return "contatos/ok";
	}

	@GetMapping("/contatos")
	public ModelAndView listar() {
		ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> lista = contatoDAO.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);

		return model;
	}
}
