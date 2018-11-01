package br.com.cursojava;

public class Pessoa {
	
	private String codigo;
	private String nome;
	
	public Pessoa(String codigo, String nome) {
		setCodigo(codigo);
		setNome(nome);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
