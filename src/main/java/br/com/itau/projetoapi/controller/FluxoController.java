package br.com.itau.projetoapi.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.projetoapi.dao.FluxoDao;
import br.com.itau.projetoapi.model.Fluxo;

@RestController
public class FluxoController {

	@Autowired
	private FluxoDao fluxodao;

	@GetMapping("/fluxos")
	public ArrayList<Fluxo> listaFluxo() {
		var listafluxo = fluxodao.findAll();
		return (ArrayList<Fluxo>) listafluxo;
	}

}
