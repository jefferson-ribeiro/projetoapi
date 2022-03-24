package br.com.itau.projetoapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // assinala que iremos trabalhar com banco de dados
@Table(name = "correntistas")

public class Correntista {

	@Id
	@Column(name = "Conta")
	private int conta;

	@Column(name = "Ag")
	private int agencia;

	@Column(name = "Nome")
	private String nome;

	@Column(name = "Email")
	private String email;

	@Column(name = "Telefone")
	private String telefone;

	@Column(name = "Saldo")
	private double saldo;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
