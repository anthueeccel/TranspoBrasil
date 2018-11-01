package br.com.cursojava.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
//		List<String> nomes = new LinkedList<>();
//		List<String> nomes = new Vector<>();		
		List<String> nomes = new ArrayList<>();
		nomes.add("Jo�o");
		nomes.add("Maria");
		nomes.add("Ad�o");
		nomes.add("Eva");
		
		System.out.println(nomes);		
		Collections.sort(nomes); // ordena��o crescente
		System.out.println(nomes);		
		Collections.sort(nomes, Collections.reverseOrder()); // ordena��o inversa (decrescente)
		System.out.println(nomes);		
		
		List<Contato> contatos = new ArrayList<>();
		contatos.add(new Contato("Jo�o", "joao@joao.com"));
		contatos.add(new Contato("Maria", "maria@mteste.com.br"));
		contatos.add(new Contato("Ad�oss", "adaocom2s@email.com"));
		contatos.add(new Contato("Eva", "eva@apple.com"));
						
		System.out.println(contatos);
		Collections.sort(contatos); // ordena��o crescente
		System.out.println(contatos);
		Collections.sort(contatos, Collections.reverseOrder()); // ordena��o inversa (decrescente)
		System.out.println(contatos);
		
	
		}
		
	}
	


