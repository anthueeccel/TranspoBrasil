package br.com.cursojava;

// Do While ser� executado ao menos uma vez. Entra no la�o e ao final verificar a condi��o.
public class ExemploDoWhile {
	
	public static void main(String[] args) {
		
		int numero = 10;
		do {
			System.out.println(numero);
			numero++;
		} while (numero < 9);
	}

}
