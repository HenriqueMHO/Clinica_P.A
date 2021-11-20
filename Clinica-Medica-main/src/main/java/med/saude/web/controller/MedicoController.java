package med.saude.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/medicos")
public class MedicoController {

	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/medico/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/medico/lista";
	}
}
