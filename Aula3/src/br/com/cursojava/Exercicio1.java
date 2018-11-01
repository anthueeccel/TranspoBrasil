package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite dois números e em seguida escreva o valor do maio número informado. Utilize Math.max

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número (n1): ");
		int n1 = Integer.parseInt(input.nextLine());
		System.out.println("Digite um número (n2): ");
		int n2 = Integer.parseInt(input.nextLine());
		System.out.printf("Dentre os números digitados, %d e %d, o maior é %d", n1, n2, Math.max(n1, n2));
		
		
		input.close();
	}

}
