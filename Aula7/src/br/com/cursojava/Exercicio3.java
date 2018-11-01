package br.com.cursojava;
// Crie um programa que solicite 5 números e em seguida escreva o valor do maior número informado.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		System.out.println("Abaixo digite 5 números");
		Scanner teclado = new Scanner(System.in);
		int nTemp = -9999999;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("número %d: ", i);
			int n1 = Integer.parseInt(teclado.nextLine());
			if (n1 > nTemp)
				nTemp = n1;
		}
		System.out.println("\nMaior número digitado: " + nTemp);
		teclado.close();

	}

}
