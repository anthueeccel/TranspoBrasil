package br.com.cursojava;

// Do While será executado ao menos uma vez. Entra no laço e ao final verificar a condição.
public class ExemploDoWhile {
	
	public static void main(String[] args) {
		
		int numero = 10;
		do {
			System.out.println(numero);
			numero++;
		} while (numero < 9);
	}

}
