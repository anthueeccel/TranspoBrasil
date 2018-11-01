package br.com.cursojava.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploList {
	
	public static void main(String[] args) {
		
//		List<String> nomes = new LinkedList<>();
//		List<String> nomes = new Vector<>();		
		List<String> nomes = new ArrayList<>();
		nomes.add("João");
		nomes.add("Maria");
		nomes.add("Adão");
		nomes.add("Eva");
		
		System.out.println(nomes);		
		Collections.sort(nomes); // ordenação crescente
		System.out.println(nomes);		
		Collections.sort(nomes, Collections.reverseOrder()); // ordenação inversa (decrescente)
		System.out.println(nomes);		
		
		List<Contato> contatos = new ArrayList<>();
		contatos.add(new Contato("João", "joao@joao.com"));
		contatos.add(new Contato("Maria", "maria@mteste.com.br"));
		contatos.add(new Contato("Adãoss", "adaocom2s@email.com"));
		contatos.add(new Contato("Eva", "eva@apple.com"));
						
		System.out.println(contatos);
		Collections.sort(contatos); // ordenação crescente
		System.out.println(contatos);
		Collections.sort(contatos, Collections.reverseOrder()); // ordenação inversa (decrescente)
		System.out.println(contatos);
		
	
		}
		
	}
	


