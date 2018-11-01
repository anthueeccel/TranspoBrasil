package br.com.cursojava;

import java.util.ArrayList;

import br.com.cursojava.Veiculo;

public class VeiculoController {

	VeiculoRepositorio repositorio = new VeiculoRepositorio();

	public boolean isMarcaValido(String marca) {
		if (marca != null && !"".equals(marca) && marca.length() >= 3) {
			return true;
		}
		return false;
	}

	public boolean isModeloValido(String modelo) {
		if (modelo != null && !"".equals(modelo.trim()) && modelo.length() >= 3) {
			return true;
		}
		return false;
	}

	public boolean adicionarVeiculo(String marca, String modelo, String placa, int anoFabricacao, int anoModelo,
			String cor) {

		Veiculo veiculo = new Veiculo();
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setPlaca(placa);
		veiculo.setAnoFabricacao(anoFabricacao);
		veiculo.setAnoModelo(anoModelo);
		veiculo.setCor(cor);
		return repositorio.adicionarVeiculo(veiculo);
	}

	public ArrayList<Veiculo> listarVeiculos() {
		return repositorio.todaLista();
	}

	public ArrayList<Veiculo> filtrarPorMarcaModeloPlaca(String pesquisa, int opcao) {
		ArrayList<Veiculo> todaLista = listarVeiculos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		if (pesquisa != null) {
			for (Veiculo veiculos : todaLista) {
				if (opcao == 3 && veiculos.getMarca().startsWith(pesquisa)) {
					lista.add(veiculos);
				} else if (opcao == 4 && veiculos.getModelo().startsWith(pesquisa)) {
					lista.add(veiculos);
				} else if (opcao == 5 && veiculos.getPlaca().startsWith(pesquisa)) {
					lista.add(veiculos);
				}
			}

		}
		return lista;

	}

	public ArrayList<Veiculo> filtrarPorAnoFabricacao(int anoFabricacao) {
		ArrayList<Veiculo> todaLista = listarVeiculos();
		ArrayList<Veiculo> lista = new ArrayList<>();
		for (Veiculo veiculo : todaLista) {
			if (anoFabricacao == veiculo.getAnoFabricacao()) {
				lista.add(veiculo);
			}
		}
		return lista;
	}

	public boolean removerVeiculo(int veiculoId) {
		boolean remover = false;
		remover = repositorio.removerVeiculo(veiculoId);
		return remover;
	}
}
