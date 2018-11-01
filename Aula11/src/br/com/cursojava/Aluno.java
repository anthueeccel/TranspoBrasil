package br.com.cursojava;
/* Crie uma classe Aluno que deve possuir os atributos nome, telefone, matricula. 
 * A classe também deve pssuir metodos de configuraçao e acesso para cada um dos atributos definidos.
 */
public class Aluno {

	String nome;
	String telefone;
	int matricula;
	
	
	void configuraNome(String nome) {
		this.nome = nome;
	}
	String retornaNome() {
		return nome;
	}
	
	
	void configuraTelefone(String nome) {
		this.telefone = nome;
	}
	String retornaTelefone() {
		return telefone;
	}
	
	
	void configuraMatricula(int matricula) {
		this.matricula = matricula;
	}
	int retornaMatricula() {
		return matricula;
	}
}
