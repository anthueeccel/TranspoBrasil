package br.com.cursojava;

import java.util.Scanner;

public class CadastroProdutos {

	ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;
		do {
			System.out.println("\n\n\n====== MENU INICIAL ======");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Somar Produtos");
			System.out.println("4 - Listar Produtos c/ Filtro de preço");
			System.out.println("9 - Sair do sistema");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != 9);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2:
			listarProdutos();
			break;
		case 3:
			somarProdutos();
			break;
		case 4:
			listarProdutosFiltro(teclado);
			break;
		case 9:
			System.out.println("\n\nObrigado por usar nossos terminais.");
			System.out.println("########  #######  #####");
			System.out.println("   ##     ##   ##  ##  ##");
			System.out.println("   ##     #####    ####");
			System.out.println("   ##     ##       ##  ##");
			System.out.println("   ##     ##       ######");
			System.out.println(" TRANSPOBRASIL  SISTEMAS");
			break;
		default:
			System.out.println("\n\nOpção Inválida\n\n\n\n");
		}
	}

	// Opção 1
	private void cadastrarProduto(Scanner teclado) {
		System.out.println("\\nn======= CADASTRAR PRODUTO =======");
		System.out.print("Informe o nome do produto: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o preço do produto: ");
		double preco = Double.parseDouble(teclado.nextLine());
		boolean ok = controller.adicionar(nome, preco);
		if(ok) {
			System.out.println("\n\nProduto adicionado com sucesso\n\n");
		} else {
			System.out.println("\n\n\nNão foi possível adicionar o produto\n\n\n");
		}

	}

	// Opção 2
	private void listarProdutos() {
		System.out.println("\n\n======= LISTAR PRODUTOS =======");
		Produto atual = null;
		Produto[] produtos = controller.listarProdutos();
		for (int index = 0; index < produtos.length; index++) {
			atual = produtos[index];
			System.out.printf("%d - %.2f - %s \n", index + 1, atual.getPreco(), atual.getNome());

		}		
	}

	// Opção 3
	private void somarProdutos() {

		double soma = controller.somaProdutos();
		System.out.printf("\n\nValor total dos produtos: %.2f \n\n", soma);
	}

	// Opção 4
	private void listarProdutosFiltro(Scanner teclado) {
		System.out.print("\nInforme o preço mínimo: ");
		double precoMinimo = Double.parseDouble(teclado.nextLine());
		Produto[] produtos = controller.listarProdutosPorPrecoMinimo(precoMinimo);
		if (produtos != null && produtos.length > 0) {
			for (Produto atual : produtos) {
				System.out.printf("%.2f - %s \n", atual.getPreco(), atual.getNome());
			}
		} else {
			System.out.println("\n\nNão existem produtos com o preço mínimo informado\n\n");
		}
	}

}
