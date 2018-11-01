package br.com.cursojava;

import java.util.ArrayList;

public class VeiculoRepositorio {

	private static ArrayList<Veiculo> veiculos = new ArrayList<>();
	private static int count = 1;

//	static {
//		veiculos.add(criaVeiculo("ford",));
//		String marca = "ford";
//		String modelo = "fiesta";
//		String placa = "mgm1010";
//		int anoFabricacao = 2011;
//		int anoModelo = 2012;
//		String cor = "azul";
//		controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
//
//		marca = "fiat";
//		modelo = "uno";
//		placa = "mgh4433";
//		anoFabricacao = 2016;
//		anoModelo = 2017;
//		cor = "branco";
//		controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
//
//		marca = "chevrolet";
//		modelo = "onix";
//		placa = "mgm3290";
//		anoFabricacao = 2017;
//		anoModelo = 2017;
//		cor = "preto";
//		controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
//
//		marca = "ford";
//		modelo = "ranger";
//		placa = "qhk5500";
//		anoFabricacao = 2015;
//		anoModelo = 2016;
//		cor = "azul";
//		controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
//
//		marca = "fiat";
//		modelo = "palio";
//		placa = "mgt2002";
//		anoFabricacao = 2017;
//		anoModelo = 2017;
//		cor = "azul";
//		controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
//
//	}
	
	public static  Veiculo criaVeiculo(String marca, String modelo, String placa, int anoFabricacao, int anoModelo,
			String cor) {

		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);
		return veiculo;
	}
	public boolean adicionarVeiculo(Veiculo veiculo) {
		boolean resultado = false;
		if (veiculo != null) {
			veiculo.setId(count++);
			resultado = veiculos.add(veiculo);
		}
		return resultado;
	}

	public ArrayList<Veiculo> todaLista() {
		return veiculos;

	}
	
	public boolean removerVeiculo(int index) {
		boolean resultado = false;		
		if(index > 0) {
		veiculos.remove(index);
		resultado = true;
		}		
		return resultado;
	}
	
	public void listaPronta() {
	VeiculoController controller = new VeiculoController();
	String marca = "ford";
	String modelo = "fiesta";
	String placa = "mgm1010";
	int anoFabricacao = 2011;
	int anoModelo = 2012;
	String cor = "azul";
	controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);

	marca = "fiat";
	modelo = "uno";
	placa = "mgh4433";
	anoFabricacao = 2016;
	anoModelo = 2017;
	cor = "branco";
	controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);

	marca = "chevrolet";
	modelo = "onix";
	placa = "mgm3290";
	anoFabricacao = 2017;
	anoModelo = 2017;
	cor = "preto";
	controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);

	marca = "ford";
	modelo = "ranger";
	placa = "qhk5500";
	anoFabricacao = 2015;
	anoModelo = 2016;
	cor = "azul";
	controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);

	marca = "fiat";
	modelo = "palio";
	placa = "mgt2002";
	anoFabricacao = 2017;
	anoModelo = 2017;
	cor = "azul";
	controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);

	}

}
