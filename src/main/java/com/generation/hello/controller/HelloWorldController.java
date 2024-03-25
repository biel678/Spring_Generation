package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")
public class HelloWorldController {
	
	@GetMapping()
	public String hello() {
		return "Hello World! <br> Olá, Mundo! <br> Buenos dias, Mundo! "
				+ "<br> Proatividade <br>  Trabalho em equipe  <br>  Orientação aos detalhes <br>"
				+ "Meu maior objetivo é ter uma carreira na área da tecnologia, <br> por conta disso irei usar os conhecimentos adquiridos hoje"
				+ "<br> para aprimorar minhas habilidades e meus conhecimentos!";
	}
}
