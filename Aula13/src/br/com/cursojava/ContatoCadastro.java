package br.com.cursojava;

import java.util.Scanner;

public class ContatoCadastro {

	private static final int SAIR = 9;
	
	
	
	ContatoController controller = new ContatoController();
	
	
	public void mostrarMenu(Scanner teclado) {

		int opcao = 0;		
		do {
			System.out.println("\n\n\n=== MENU INICIAL ===");
			System.out.println("1 - Cadastrar Contato");
			System.out.println("2 - Listar Contatos");
			System.out.println("3 - Pesquisar Contato por nome");
			System.out.println("4 - Pesquisar Contato por telefone");
			System.out.println("9 - Sair do sistema");
			opcao = Integer.parseInt(teclado.nextLine());
			tratarOpcao(opcao, teclado);
		} while (opcao != SAIR);
	}

	private void tratarOpcao(int opcao, Scanner teclado) {
		switch (opcao) {
		case 1:
			cadastrarContato(teclado);
			break;
		case 2:
			listarContatos();
			break;
		case 3:
			filtrarPorNome(teclado);
			break;
		case 4:
			pesquisarContatoTelefone(teclado);
			break;
		case SAIR:
			System.out.println("\n\nObrigado por usar nossos terminais.");
			System.out.println("########  #######  #####");
			System.out.println("   ##     ##   ##  ##  ##");
			System.out.println("   ##     #####    ####");
			System.out.println("   ##     ##       ##  ##");
			System.out.println("   ##     ##       ######");
			System.out.println("TRANSPOBRASIL SISTEMAS 1998\u00A9");			
			break;
		default:
			System.out.println("\n\nOpção Inválida\n\n\n\n");
		}
	}
	

	private void cadastrarContato(Scanner teclado) {
		System.out.println("\n\n=== CADASTRO DE CONTATO ===");
		System.out.print("Código: ");
		String codigo = teclado.nextLine();
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Telefone: ");
		String telefone = teclado.nextLine();
		System.out.print("Email: ");
		String email = teclado.nextLine();
		
		boolean ok = controller.adicionar( codigo, nome, telefone, email);
		if(ok) {
			System.out.println("\n\nContato adicionado com sucesso!\n\n");
		} else {
			System.out.println("\n\n\nNão foi possível adicionar o contato\n\n\n");
		}
		
		
	}
	
	private void listarContatos() {
		System.out.println("\n\n=== Lista de Contatos ===");
		Contato atual = null;
		Contato[] contatos = controller.listarContatos();
//		for (int index = 0; index < contatos.length; index++) {
//			atual = contatos[index];
//			System.out.printf("%d - %s - %s - %s\n", atual.getId(), atual.getNome(), atual.getEmail(), atual.getTelefone());
//
//		}
		//for each
		for (Contato contato : contatos) {
			System.out.printf("%d | %s : %s - %s - %s\n", contato.getId(), contato.getCodigo(), contato.getNome(), contato.getEmail(), contato.getTelefone());
		}
		
	}
	
	private void filtrarPorNome(Scanner teclado) {
		System.out.println("\n\nDigite o nome do contato: ");
		Contato atual = null;
		String nome = teclado.nextLine();		
		Contato[] contatos = controller.filtrarPorNome(nome);
		for (Contato contato : contatos) {
			
		}
		for (int index = 0; index < contatos.length; index++) {
			atual = contatos[index];
			System.out.printf("%d | %s : %s - %s - %s\n", atual.getId(), atual.getCodigo(), atual.getNome(), atual.getEmail(), atual.getTelefone());

		}		
		
	}
	
	private void pesquisarContatoTelefone(Scanner teclado) {
		// TODO Auto-generated method stub
		
	}

}
