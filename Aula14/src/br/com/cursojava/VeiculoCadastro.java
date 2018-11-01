package br.com.cursojava;

import java.util.ArrayList;
import java.util.Scanner;

public class VeiculoCadastro {

	private static final int SAIR = 8;
	//private static String marcaModelo;
	private VeiculoController controller = new VeiculoController();
	private static int opcao = 0;
	public void mostrarMenu(Scanner teclado) {
		//int opcao = 0;

		do {
			System.out.println("MENU Principal");
			System.out.println("1 - Cadastrar novo veículo");
			System.out.println("2 - Listar veículos");
			System.out.println("3 - Pesquisar por marca");
			System.out.println("4 - Pesquisar por modelo");
			System.out.println("5 - Pesquisar por placa");
			System.out.println("6 - Pesquisar por ano de fabricação");
			System.out.println("7 - Remover veículo");			
			System.out.println("8 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);

	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			novoVeiculo(teclado);
			break;
		case 2:
			listarVeiculos();

			break;
		case 3:
			filtrarPorMarcaModeloPlaca(teclado);
			break;
		case 4:
			filtrarPorMarcaModeloPlaca(teclado);
			break;
		case 5:
			filtrarPorMarcaModeloPlaca(teclado);
			break;
		case 6:
			filtrarPorAnoFabricacao(teclado);
			break;
		case 7:
			removerVeiculo(teclado);
			break;		
		case SAIR:
			System.out.println("===================================");
			System.out.println("= Obrigado por usar nosso sistema =");
			System.out.println("===================================");
			break;
		// adiciona lista de veiculos pronta. 
		case 9:
			listaPronta();
			break;
		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

	private void novoVeiculo(Scanner teclado) {
		System.out.println("=== Cadastro de veículo ===");		
		String marca;
		String modelo;
		String placa;
		int anoFabricacao;
		int anoModelo;
		String cor;
		do{
			System.out.print("Marca: ");
			marca = teclado.nextLine();
		}while(!controller.isMarcaValido(marca));
		
		do{
			System.out.print("Modelo: ");
			modelo = teclado.nextLine();
		}while(!controller.isModeloValido(modelo));
		
		System.out.print("Placa: ");
		placa = teclado.nextLine();
		System.out.print("Ano de fabricação (formato AAAA): ");
		anoFabricacao = Integer.parseInt(teclado.nextLine());
		System.out.print("Modelo de fabricação (formato AAAA): ");
		anoModelo = Integer.parseInt(teclado.nextLine());
		System.out.print("Cor: ");
		cor = teclado.nextLine();
		
		boolean ok = controller.adicionarVeiculo(marca, modelo, placa, anoFabricacao, anoModelo, cor);
		if(ok){
			System.out.println("Veiculo adicionado com sucesso");
		}else{
			System.out.println("Não foi possível adicionar o veículo");
		}
	}
	
	private void listarVeiculos() {
        ArrayList<Veiculo> lista = controller.listarVeiculos();        
        System.out.println("ID | MARCA MODELO - PLACA - ANO.FAB/ANO.MOD - COR");
        for (Veiculo veiculo : lista) {
        	System.out.printf("%d | %s %s - %s - %d/%d - %s \n",veiculo.getId(), 
        			veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getAnoFabricacao(), 
        			 veiculo.getAnoModelo(), veiculo.getCor());
		}
        System.out.println("Veiculos cadastrados: " + lista.size());
        System.out.println("========== FIM DA LISTA =======");
	}

	private void filtrarPorMarcaModeloPlaca(Scanner teclado) {
		if(opcao == 3) {
			System.out.println("\nFiltro - Digite a marca:");
		} else if(opcao == 4) {
			System.out.println("\nFiltro - Digite o modelo:");
		} else {
			System.out.println("\nFiltro - Digite a placa:");
		}
		String pesquisa = teclado.nextLine().trim();
		ArrayList<Veiculo> lista = controller.filtrarPorMarcaModeloPlaca(pesquisa, opcao);
		 System.out.println("ID | MARCA MODELO - PLACA - ANO.FAB/ANO.MOD - COR");
		 for (Veiculo veiculo : lista) {
			 System.out.printf("%d | %s %s - %s - %d/%d - %s \n",veiculo.getId(), 
        			 veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getAnoFabricacao(), 
        			 veiculo.getAnoModelo(), veiculo.getCor());
		}
		 System.out.println("\n\n");
	}


	private void filtrarPorAnoFabricacao(Scanner teclado) {
		System.out.println("\nFiltro - Digite o ano de fabricação: ");
		int anoFabricacao = Integer.parseInt(teclado.nextLine().trim());
		ArrayList<Veiculo> lista = controller.filtrarPorAnoFabricacao(anoFabricacao);
		 System.out.println("ID | MARCA MODELO - PLACA - ANO.FAB/ANO.MOD - COR");
		 for (Veiculo veiculo : lista) {
        	 System.out.printf("%d | %s %s - %s - %d/%d - %s \n",veiculo.getId(), 
        			 veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca(), veiculo.getAnoFabricacao(), 
        			 veiculo.getAnoModelo(), veiculo.getCor());
		}		
		System.out.println("\n\n");
	}

	private void removerVeiculo(Scanner teclado) {
		ArrayList<Veiculo> lista = controller.listarVeiculos();        
        System.out.println("ID | MARCA MODELO - PLACA");
        for (Veiculo veiculo : lista) {
        	System.out.printf("%d | %s %s - %s\n",veiculo.getId(), 
        			veiculo.getMarca(), veiculo.getModelo(), veiculo.getPlaca());
		}
        System.out.println("========== FIM DA LISTA =======");
        System.out.println("\n= REMOVER VEICULO DO CADASTRO =\nDigite o ID: ");
        int veiculoId = Integer.parseInt(teclado.nextLine());
        boolean ok = controller.removerVeiculo(veiculoId -1);
        if (ok) {
        	System.out.println("Veículo excluído do sistema");
        } else {
        	System.out.println("Não foi possível excluir. verifique o ID e tente novamente");
        }
        
		
	}
	
	private void listaPronta() {
		VeiculoRepositorio repositorio = new VeiculoRepositorio();
		repositorio.listaPronta();
	}
	
}
