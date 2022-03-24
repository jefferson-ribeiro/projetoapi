package br.com.itau.projetoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CorrentistaController {

	@Autowired
//	private ContaDao dao;
	
	@GetMapping("/correntistas")
	public String testeCorrentistas() {
		return "Teste correntistas";
	}
	
}
