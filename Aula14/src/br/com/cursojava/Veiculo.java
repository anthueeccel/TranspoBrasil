package br.com.cursojava;
/* Crie um aplica��o para cadastro de ve�culos, cada ve�culo deve possuir as seguintes propriedades: 
 * id: Integer
 * marca: String
 * modelo: String
 * placa: String
 * anoFabricacao: int
 * anoModelo: int
 * cor: String
 * 
 * O sistema deve permitir o cadastro de um novo, ve�culo, a listagem de todos os ve�culos, a pesquisa de ve�culos
 * por marca, a pesquisa de ve�culos por modelo, a pesquisa de ve�culos por placa, a pesquisa de ve�culos por ano
 * no de fabrica��o e a remo��o de ve�culos. 
 * 
 * Marca e modelo s�o propriedades obrigat�rias e dev possuir ao menos 3 caracteres n�o vazios (espa�os).
 * A placa � uma propriedade obrigat�ria, e dev epossuir obrigatoriamente 7 caracteres.
 * O ano de fabrica�ao deve ser maior ou igual a 2000.
 * O ano modelo n�o deve ser menor que o ano de fabrica��o.
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
