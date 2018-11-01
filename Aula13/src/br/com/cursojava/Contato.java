package br.com.cursojava;

/* Crie um programa de cadastro de contatos conforme as definições abaixo. O contato deve possuir os seguinte
 * atributos: 
 * 
 * id: Integer
 * nome: String
 * telefone: String
 * email: String
 * 
 * O programa deve apresentar opções para Cadastrar um novo contato, listar os contatos cadastrados, realizar 
 * a pesquisa de um contato através do nome, realizar a pesquisa de um contato através do número de telefone.
 * 
 * Todo contato deve obrigatoriamente possuir um nome com ao menos 3 caracteres;
 * Não deve ser permitida a inclusão de ocntatos com o nome em branco;
 * 
 * O Sistema deve ter como base estrutural o sistema de produtos realizado na aula12.
 */

public class Contato extends Pessoa {

	Integer id;
	String telefone;
	String email;

	public Contato(Integer id, String codigo, String nome, String telefone, String email) {
		super(codigo, nome);
		this.email = email;
		this.telefone = telefone;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		email.trim();
		this.email = email;
	}

}
