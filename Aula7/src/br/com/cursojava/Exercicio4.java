package br.com.cursojava;
/* Crie um programa que solicite 5 números e em seguida apresente o valor da soma e da média. */

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
//				
		int nota = 0;
		int soma = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("digite a %d nota: ", i);
			nota = Integer.parseInt(teclado.nextLine());
			soma += nota;
		}

		teclado.close();

		int media = soma / 5;
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

		System.out.printf("\nFim da Aplicação");
	}

}
