package br.com.cursojava;

import java.util.HashSet;
import java.util.Set;

public class usoProduto {
	
	public static void main(String[] args) {
		
		
		Produto p = new Produto(1, "Produto 1", 1.99, Categoria.ALIMENTO);	
		
		imprimirCategoria(p);
		
		Set<Produto> produtos = new HashSet<>();
		produtos.add(p);
		
		System.out.println(produtos.contains(new Produto(1, "Produto 1", 1.99, Categoria.ALIMENTO)));
		System.out.println(produtos.contains(p));
		System.out.println(produtos.size());
		produtos. remove(new Produto(1, "Produto 1", 1.99, Categoria.ALIMENTO));
		System.out.println(produtos.size());
		
	}
	
	private static void imprimirCategoria(Produto produto) {
		String categoria = "";
		
		switch(produto.getCategoria()) {
		case ALIMENTO :
			categoria = "Alimento";
			break;
		case ELETRONICO:
			categoria = "Eletrônico";
			break;
		case LIMPEZA:
			categoria = "Limpeza";
			break;
		case PERFUMARIA:
			categoria = "Perfumaria";
			break;
		case VESTUARIO:
			categoria = "Vestuário";
			break;			
		}
		
		System.out.printf("Categoria = %s - %s\n", categoria, produto.getCategoria().name());
	}


}
