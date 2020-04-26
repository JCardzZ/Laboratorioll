package com.mm.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerPrincipal {

	public String mostrar () {
		return null;
	}

	@GetMapping("/")
	public String paginaPrincipal(Model model) {
		String nombre = "El apoyo económico brindado por el Gobierno de El Salvador está dirigido a personas afectadas por la pandemia del COVID-19. Dicho beneficio corresponde a $300 por vivienda.";
		String dato = "© Copyright 2020. Presidencia de la República de El Salvador";

		model.addAttribute("nombre", nombre);
		model.addAttribute("dato", dato);

		return "index";

	}
}
