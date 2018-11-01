package br.com.cursojava;

import java.util.Scanner;

public class CadastroProdutos {

	private Produto[] produtos = new Produto[50];
	private int quantidade = 0;
	
	public void mostrarMenu(Scanner teclado) {
		
		int opcao = 0;
		do {
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Listar Produtos");
			System.out.println("3 - Sair do sistema");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while(opcao != 3);		
	}
	
	private void tratarOpcao(int opcao, Scanner teclado) {
		switch(opcao) {
		case 1:
			cadastrarProduto(teclado);
			break;
		case 2: listarProdutos();
		break;
		case 3: 
			System.out.println("\n\nOpbrigado por usar nossos terminais.");
			default:
				System.out.println("Opção Inválida");
		}
	}

	private void cadastrarProduto(Scanner teclado) {
		System.out.println("======= CADASTRAR PRODUTO =======");
		System.out.print("Informe o nome do produto: ");
		String nome = teclado.nextLine();
		System.out.print("Informe o preço do produto: ");
		double preco = Double.parseDouble(teclado.nextLine());
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setPreco(preco);
		if(quantidade < produtos.length) {
			produtos[quantidade++] = produto;
		} else {
			System.out.println("Quantidade máxima de produtos excedida\n");
		}
		System.out.println("======= FIM CADASTRAR PRODUTO =======\n");
		
	}
	

	private void listarProdutos() {
		System.out.println("======= CADASTRAR PRODUTO =======");
		Produto atual = null;
		for(int index = 0; index < quantidade; index++) {
			atual = produtos[index];
			System.out.printf("%d - %.2f - %s \n", index+1, atual.getPreco(), atual.getNome());
		}
		System.out.println("\n======= FIM LISTAR PRODUTO =======\n");
	}
}
