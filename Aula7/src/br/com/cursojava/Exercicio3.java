package br.com.cursojava;
// Crie um programa que solicite 5 n�meros e em seguida escreva o valor do maior n�mero informado.

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		System.out.println("Abaixo digite 5 n�meros");
		Scanner teclado = new Scanner(System.in);
		int nTemp = -9999999;
		for (int i = 1; i <= 5; i++) {
			System.out.printf("n�mero %d: ", i);
			int n1 = Integer.parseInt(teclado.nextLine());
			if (n1 > nTemp)
				nTemp = n1;
		}
		System.out.println("\nMaior n�mero digitado: " + nTemp);
		teclado.close();

	}

}
