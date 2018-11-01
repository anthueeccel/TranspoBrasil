package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;

public class ContatoDAOtest {

	public static void main(String[] args) {

		ContatoDAO dao = new ContatoDAO();
		List<Contato> contatos = new ArrayList<>();

//		Adicionar contato
//		Contato contato1 = new Contato(null, "Jorge", "jorge@email.com", "34170017");
//		dao.inserir(contato1);
//		System.out.println(contato1 + " adicionado com sucesso!");

////		buscar todos os contatos
		List<Contato> listaContatos = dao.buscarTodos();
		for (Contato contato : listaContatos) {
			System.out.println(contato);
		}

//		buscar pode Id
		System.out.println("Busca por Id (todos)");
		for (int i = 1; i <= 10; i++) {
			System.out.println(dao.buscarPorId(i));
		}
		
//		buscar por nome
		System.out.print("Buscar por Nome: ");
		System.out.println(dao.buscarPorNome("Marco"));

//		burcar por telefone
		System.out.print("Buscar por telefone: ");
		System.out.println(dao.buscarPorTelefone("33300032"));
		
		

//		atualiza nome do contato 3 
//		System.out.println("Atualiza ID = 3");
//		Contato contato = dao.buscarPorId(3);
//		System.out.println(contato);
//		contato.setNome("Marco da Silva");
//		contato.setEmail("marcos@email.me");
//		contato.setTelefone("4730001717");
//		dao.atualizar(contato);
//		System.out.println(dao.buscarPorId(3));
		
//		remover contato ID = 10
//		System.out.println("remover contato ID = 10");
//		dao.remover(10);
//		for(int i = 1; i <=10; i++) {
//		System.out.println(dao.buscarPorId(i));
//		}
		
//		contar quantidade de contatos
		System.out.println(dao.contar(0));
		
		

	}

}
