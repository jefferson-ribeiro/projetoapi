package br.com.itau.projetoapi.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itau.projetoapi.model.Correntista;

//Criando a interface
public interface CorrentistaDao extends CrudRepository<Correntista, Integer> {

}
