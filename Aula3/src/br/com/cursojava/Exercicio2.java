package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite3 números reais e em seguida apresente o resultado 
// da média dos números informados.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Digite o segundo número:");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.println("Digite o terceiro número:");
		int n3 = Integer.parseInt(input.nextLine());
		input.close();
		
		System.out.printf("A média dos números: %d, %d, %d é %.2f", n1, n2, n3, (double)((n1 + n2 + n3)/3));
		
	}

}
