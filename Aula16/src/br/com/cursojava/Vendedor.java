package br.com.cursojava;

public class Vendedor extends Funcionario {

	private double percentualVenda;
	private double totalVendas;
	{
		System.out.println("System.Out em tmepo de execução");
	}

	// construtor sem parâmetros.
	public Vendedor() {
		super(); // não é necessário escrever. Java chama automaticamente.

	}

	// construtor com parâmetros
	public Vendedor(String codigo, String nome, double salarioBase) {
		super(codigo, nome, salarioBase); // se escrever sempre na primeira linha.
		setCodigo(codigo);
		setNome(nome);
		setSalarioBase(salarioBase);
	}

	public double getPercentualVenda() {
		return percentualVenda;
	}

	public void setPercentualVenda(double percentualVenda) {
		this.percentualVenda = percentualVenda > 1 ? percentualVenda / 100 : percentualVenda;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override // significa que já tem um método no PAI e esta sendo sobre-escrito
	public double salarioLiquido() {
		double acrescimo = 0;
		if (totalVendas >= 20000) {
			acrescimo = totalVendas * getPercentualVenda();
		}
		double salario = (getSalarioBase() + acrescimo) * (1 - 0.11);
		return salario;
	}

	// sobrecarga do método quando passa parâmetros/variáveis diferentes.
	public double salarioLiquido(int desconto) {
		return salarioLiquido();
	}

}
