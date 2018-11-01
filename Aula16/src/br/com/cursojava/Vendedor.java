package br.com.cursojava;

public class Vendedor extends Funcionario {

	private double percentualVenda;
	private double totalVendas;
	{
		System.out.println("System.Out em tmepo de execu��o");
	}

	// construtor sem par�metros.
	public Vendedor() {
		super(); // n�o � necess�rio escrever. Java chama automaticamente.

	}

	// construtor com par�metros
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

	@Override // significa que j� tem um m�todo no PAI e esta sendo sobre-escrito
	public double salarioLiquido() {
		double acrescimo = 0;
		if (totalVendas >= 20000) {
			acrescimo = totalVendas * getPercentualVenda();
		}
		double salario = (getSalarioBase() + acrescimo) * (1 - 0.11);
		return salario;
	}

	// sobrecarga do m�todo quando passa par�metros/vari�veis diferentes.
	public double salarioLiquido(int desconto) {
		return salarioLiquido();
	}

}
