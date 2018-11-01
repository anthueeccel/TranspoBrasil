package br.com.cursojava;

import java.util.List;
import java.util.Scanner;

public class Main {

	private static final int CADASTRAR_PRODUTO = 1;
	private static final int LISTAR_PRODUTO = 2;
	private static final int LISTAR_FAIXA_PRECO = 3;
	private static final int LISTAR_NOME = 4;
	private static final int EDITAR_PRODUTO = 5;
	private static final int REMOVER_PRODUTO = 6;
	private static final int CONTAR = 7;
	private static final int SAIR = 8;

	private ProdutoController controller = new ProdutoController();

	public void mostrarMenu(Scanner teclado) {
		int opcao = 0;

		do {
			System.out.println("\n==== MENU Principal ====");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Pesquisar por preço");
			System.out.println("4 - Pesquisar nome");
			System.out.println("5 - Editar Produto");
			System.out.println("6 - Remover Produto");
			System.out.println("7 - Quantidade de produtos");
			System.out.println("8 - Sair do sistema");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);

	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case CADASTRAR_PRODUTO:
			adicionarProduto(teclado);
			break;
		case LISTAR_PRODUTO:
			listarProdutos();
			break;
		case LISTAR_FAIXA_PRECO:
			filtrarPorPreco(teclado);
			break;
		case LISTAR_NOME:
			filtrarPorNome(teclado);
			break;
		case EDITAR_PRODUTO:
			editarProduto(teclado);
			break;
		case REMOVER_PRODUTO:
			removerProduto(teclado);
			break;
		case CONTAR:
			contarProduto(0);
			break;
		case SAIR:
			System.out.println("Obrigado por usar nosso sistema");
			JPAUtil.shutdown();
			System.exit(0);
			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

	}

	private void contarProduto(int quantidade) {
		System.out.println("Total de produtos cadastrados: " + controller.contar(quantidade));

	}

	private void adicionarProduto(Scanner teclado) {
		System.out.println("======== CADASTRAR PRODUTO =============");
		String nome;
		do {
			System.out.print("Nome:");
			nome = teclado.nextLine();
		} while (!controller.isNomeValido(nome));

		System.out.print("Preço:");
		Double preco = Double.parseDouble(teclado.nextLine());

		String ok = controller.adicionarProduto(nome, preco);
		if (ok == "y") {
			System.out.println("Produto adicionado com sucesso!");
		} else {
			System.out.println("Não foi possível adicionar o produto");
		}

	}

	private void listarProdutos() {
		List<Produto> lista = controller.buscarTodos();
		System.out.println("== LISTA DE PRODUTOS (ordem alfabética)==");
		for (Produto produto : lista) {
			System.out.printf("%d | %s - %.2f\n", produto.getId(), produto.getNome(), produto.getPreco());
		}
		System.out.println("Produtos listados: " + lista.size());
		lista.clear();
	}

	private void filtrarPorPreco(Scanner teclado) {
		System.out.println("======== FILTRAR POR PREÇO =============");
		Double minimo, maximo;
		do {
			System.out.print("Valor mínimo: ");
			minimo = Double.parseDouble(teclado.nextLine());
		} while (!controller.isPrecoValido(minimo));

		do {
			System.out.print("Valor máximo: ");
			maximo = Double.parseDouble(teclado.nextLine());
		} while (!controller.isPrecoValido(maximo));

		List<Produto> lista = controller.filtrarPorFaixaPreco(minimo, maximo);
		for (Produto produto : lista) {
			System.out.printf("%d | %s - %.2f\n", produto.getId(), produto.getNome(), produto.getPreco());
		}
		System.out.println("Produtos listados: " + lista.size());
		lista.clear();
	}

	private void filtrarPorNome(Scanner teclado) {
		System.out.println("======== FILTRAR POR NOME =============");
		String nome;
		do {
			System.out.print("Nome do produto: ");
			nome = teclado.nextLine().toUpperCase();
		} while (!controller.isNomeValido(nome));

		List<Produto> lista = controller.filtrarPorNome(nome);
		for (Produto produto : lista) {
			System.out.printf("%d | %s - %.2f\n", produto.getId(), produto.getNome(), produto.getPreco());
		}
		System.out.println("Produtos listados: " + lista.size());
		lista.clear();

	}

	private void editarProduto(Scanner teclado) {
		System.out.println("======== EDITAR PRODUTO =============");
		Integer id;
		Produto produto;
		do {
			System.out.print("ID do produto: ");
			id = Integer.parseInt(teclado.nextLine().trim());
			produto = controller.buscarPorId(id);
		} while (id == null);		
		System.out.println(produto);
		String nome;
		do {
			System.out.print("Novo nome:");
			nome = teclado.nextLine();
		} while (!controller.isNomeValido(nome));

		System.out.print("Novo preço:");
		Double preco = Double.parseDouble(teclado.nextLine());
		produto.setNome(nome);
		produto.setPreco(preco);
		controller.editarProduto(produto);

	}

	private void removerProduto(Scanner teclado) {
		System.out.println("======== REMOVER PRODUTO =============");
		Integer id;
		do {
			System.out.print("ID do produto: ");
			id = Integer.parseInt(teclado.nextLine());
		} while (id == null);
		controller.removerProduto(id);
		// Imprime SE produto foi removido da lista.
		if (id == 1) {
			System.out.println("Produto removido com sucesso!");
		} else {
			System.out.println("Não foi possivel remover ou produto inexistente");
		}

	}
}
