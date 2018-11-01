package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite 3 números para o usuário e em seguida escreva o resultado da 
// soma do primeiro número com o terceiro número  e em seguida multiplique o resultado pelo segundo 
// número informado. Mostre na tela o resultado da aplicação.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Primeiro número: ");
		double n1 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Segundo número: ");
		double n2 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Terceiro número: ");
		double n3 = Double.parseDouble(pergunta.nextLine());
		pergunta.close();
		System.out.printf("Cálculo: (%.2f + %.2f) * %.2f = %.2f", n1, n3, n2, ((n1+n3)*n2));
		
		
	}

}
