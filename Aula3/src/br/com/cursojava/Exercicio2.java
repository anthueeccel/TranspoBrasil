package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite3 n�meros reais e em seguida apresente o resultado 
// da m�dia dos n�meros informados.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero:");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Digite o segundo n�mero:");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println("Digite o terceiro n�mero:");
		int n3 = Integer.parseInt(input.nextLine());
		input.close();
		
		System.out.printf("A m�dia dos n�meros: %d, %d, %d � %.2f", n1, n2, n3, (double)((n1 + n2 + n3)/3));
		
	}

}
