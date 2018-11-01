package br.com.cursojava;


import java.util.Map;
import java.util.TreeMap;

public class ExemploTreeMap {

public static void main(String[] args) {
		
		Map<Integer, String> nomes = new TreeMap<Integer, String>();
		
		nomes.put(88, "Fred");
		nomes.put(77, "Anthue");
		nomes.put(66, "Fred" );
		System.out.println();
		
		System.out.println(nomes.get(88));
		System.out.println(nomes.get(77));
		
		System.out.println(nomes.size());
		
		if (nomes.isEmpty()){
			System.out.println("Est� vazio. (true)");
		}else{
			System.out.println("N�o est� vazio. (false)");
		}
		
		if (nomes.containsValue("Fred")){
			System.out.println("Fred est� entre os nomes. (true)");
		}else{
			System.out.println("Fred n�o est� entre os nomes. (false)");
		}
		
		if (nomes.containsKey(77)){
			System.out.println("O n�mero 77 est� entre as chaves. (true)");
		}else{
			System.out.println("o n�mero 77 n�o est� entre as chaves. (false)");
		}
		
		for (Map.Entry<Integer, String> item : nomes.entrySet()) {
			System.out.printf("%d = %s\n",item.getKey(), item.getValue());
		}
		
		nomes.clear();
		System.out.println("Tamanho: " + nomes.size() + " (TreeMap vazia)");


	}

}
