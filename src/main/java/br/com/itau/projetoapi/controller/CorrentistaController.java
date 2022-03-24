package br.com.itau.projetoapi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.projetoapi.dao.CorrentistaDao;
import br.com.itau.projetoapi.model.Correntista;
import br.com.itau.projetoapi.model.Fluxo;

@RestController
public class CorrentistaController {

	@Autowired
	private CorrentistaDao correnntistadao;

	@GetMapping("/index")
	public String testeInicial() {
		return "Criar uma API para consulta de Correntistas x Fluxo de Caixa";
	}

	@GetMapping("/correntistas")
	public ArrayList<Correntista> recuperarCorrentistas() {
		var listaCorrentistas = correnntistadao.findAll();
		return (ArrayList<Correntista>) listaCorrentistas;
	}

	@GetMapping("/correntista/{id}")
	public String rotaCoringa(@PathVariable int id) {
		return "O resultado do parametro é: " + id;
	}

}
