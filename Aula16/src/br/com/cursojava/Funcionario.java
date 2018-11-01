package br.com.cursojava;

// não é necessário escrever extends Object pois isso é feito automaticamente.
public class Funcionario extends Object {

	private String nome;
	private String codigo;
	private double salarioBase;

	
	public Funcionario() {
		
	}
	
	public Funcionario(String codigo, String nome, double salarioBase) {
		
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double salarioLiquido() {
		double salario = (salarioBase * (1 - 0.11));
		return salario;
	}

}
