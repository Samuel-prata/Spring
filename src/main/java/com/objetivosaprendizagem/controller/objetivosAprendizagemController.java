package com.objetivosaprendizagem.controller;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivosAprendizagem")
public class objetivosAprendizagemController {

	@GetMapping
	public String imprimir(){
		return "Objetivos de aprendizagem\n"
				+ "Praticar bastante\n"
				+ "Complementar com cursos\n"
				+ "Construir aplicações por conta própria\n"
				+ "Fazer Me aprofundar nas tecnologias\n";
	}
	
}
