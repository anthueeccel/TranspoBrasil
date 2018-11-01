package br.com.cursojava;
/* Crie uma classe Veiculo, que possua os atributos marca, modelo, cor, ano de fabricação e ano modelo.
 * A classe também deve pssuir metodos de configuraçao e acesso para cada um dos atributos definidos.
 */

public class Veiculo {

	String marca;
	String modelo;
	String cor;
	int anoFabricacao;
	int anoModelo;
	
	void configuraMarca (String marca) {		
		this.marca = marca;		
	}
	
	String retornaMarca() { 
		return marca;
	}
	
	
	void configuraModelo (String modelo) {
		this.modelo = modelo;
	}
	
	String retornaModelo() {
		return modelo;
	}
	
	
	void configuraCor (String cor) {
		this.cor = cor;
	}
	
	String retornaCor() {
		return cor;
	}
	
	
	void configuraAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	int retornaAnofabricacao() {
		return anoFabricacao;
	}
	
	
	void configuraAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	
	int retornaAnoModelo() { 
		return anoModelo;
	}
}
