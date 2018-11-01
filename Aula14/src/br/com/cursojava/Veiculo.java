package br.com.cursojava;
/* Crie um aplicação para cadastro de veículos, cada veículo deve possuir as seguintes propriedades: 
 * id: Integer
 * marca: String
 * modelo: String
 * placa: String
 * anoFabricacao: int
 * anoModelo: int
 * cor: String
 * 
 * O sistema deve permitir o cadastro de um novo, veículo, a listagem de todos os veículos, a pesquisa de veículos
 * por marca, a pesquisa de veículos por modelo, a pesquisa de veículos por placa, a pesquisa de veículos por ano
 * no de fabricação e a remoção de veículos. 
 * 
 * Marca e modelo são propriedades obrigatórias e dev possuir ao menos 3 caracteres não vazios (espaços).
 * A placa é uma propriedade obrigatória, e dev epossuir obrigatoriamente 7 caracteres.
 * O ano de fabricaçao deve ser maior ou igual a 2000.
 * O ano modelo não deve ser menor que o ano de fabricação.
 */

public class Veiculo {
	
	private int id;
	private String marca;
	private String modelo;
	private String placa;
	private int anoFabricacao;
	private int anoModelo;
	private String cor;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	
	
	

}
