package br.com.cursojava;

import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		
	
	//definir uma lista de nomes
	ArrayList<String> listaNomes = new ArrayList<>();
	
	//quantos elementos tem a lista
	int quantidadeIncial = listaNomes.size();	
	System.out.println(quantidadeIncial);
	
	//adicionar elementos
	listaNomes.add("Jo�o"); //adiciona um elemento ao final da lista
	System.out.println(listaNomes.size());
	
	listaNomes.add("Maria");
	System.out.println(listaNomes.size());
	System.out.println(listaNomes);
	
	listaNomes.add(0,"Ad�o"); //adiciona elemento em um �ndice espec�fico
	System.out.println(listaNomes);
	listaNomes.add(1,"Eva");
	System.out.println(listaNomes);
	
	listaNomes.set(1,"Eva Maria da Silva"); //altera u elemento da lista com �ndice espec�fico.
	System.out.println(listaNomes);
	
	System.out.println(listaNomes.get(3)); // busca um elemento de �ndice espec�fico
	
	System.out.println(listaNomes.remove(1));
	System.out.println(listaNomes);
	System.out.println(listaNomes.size());
	System.out.println(listaNomes.remove("Jo�o"));
	System.out.println(listaNomes);
	
	listaNomes.indexOf("Maria");
	System.out.println(listaNomes);

	
	
	
	
	}
}
