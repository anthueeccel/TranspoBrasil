package br.com.cursojava;


import java.util.Hashtable;
import java.util.Map;

public class ExemploHashTable {

	public static void main(String[] args) {

		Map<Integer, String> nomes = new Hashtable<Integer, String>();

		nomes.put(88, "Fred");
		nomes.put(77, "Anthue");
		//nomes.put(66, null);
		System.out.println();

		System.out.println(nomes.get(88));
		System.out.println(nomes.get(77));

		System.out.println(nomes.size());

		if (nomes.isEmpty()){
			System.out.println("Está vazio. (true)");
		}else{
			System.out.println("Não está vazio. (false)");
		}
		
		if (nomes.containsValue("Fred")){
			System.out.println("Fred está entre os nomes. (true)");
		}else{
			System.out.println("Fred não está entre os nomes. (false)");
		}
		
		if (nomes.containsKey(77)){
			System.out.println("O número 77 está entre as chaves. (true)");
		}else{
			System.out.println("o número 77 não está entre as chaves. (false)");
		}

		nomes.remove(77);
		if (nomes.containsKey(77)){
			System.out.println("O número 77 está entre as chaves. (true)");
		}else{
			System.out.println("o número 77 não está entre as chaves. (false)");
		}
		
		nomes.put(77, "Anthue");
		for (Map.Entry<Integer, String> item : nomes.entrySet()) {
			System.out.printf("%d = %s\n", item.getKey(), item.getValue());
		}
		
		nomes.clear();
		System.out.println("Tamanho: " + nomes.size() + " (HashTable vazia)");

	}

}
