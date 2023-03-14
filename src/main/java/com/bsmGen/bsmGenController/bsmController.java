package com.bsmGen.bsmGenController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsmController {

	@GetMapping
	public String imprima() {
		return "Proatividade\n" + "Persistencia\n" + "Comunicação\n" + "Trabalho em equipe\n"
				+ "Responsabilidade Pessoal\n" + "Orientação ao detalhe\n" + "Orientação ao futuro\n"
				+ "Mentalidade de crescimento\n";
	}
}