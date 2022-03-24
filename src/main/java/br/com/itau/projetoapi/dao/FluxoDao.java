package br.com.itau.projetoapi.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.projetoapi.model.Fluxo;

//Criando a interface
public interface FluxoDao extends CrudRepository<Fluxo, Integer> {

}
