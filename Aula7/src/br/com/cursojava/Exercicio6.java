package br.com.cursojava;
/* Crie um programa que solicite uma frase e em seguida apresente as letras dos índices ímpares*/

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma frase \n");
		String frase = teclado.nextLine();
		teclado.close();

		System.out.println("\nAbaixo somente as letras dos índices ímpares");
		for (int i = 1; i < frase.length(); i += 2) {
			System.out.print(frase.charAt(i) + " ");
		}

	}

}
