package br.com.cursojava;
/* Crie uma classe Produto que possua os atributos nome e preco, a classe tamb�m deve possuir m�todos de
 * configura��o e acesso para cada um dos atributos definidos.
 */

public class Produto {

	private String nome;
	private double preco;
	private boolean promocao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco >= 0.01) {
			this.preco = preco;
		} else {
			System.out.println("Valor inv�lido para cadastro de produto");
		}
	}

	public boolean isPromocao() {
		return promocao;
	}

	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}

}
