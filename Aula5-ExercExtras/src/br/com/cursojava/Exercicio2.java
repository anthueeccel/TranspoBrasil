package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite 3 n�meros para o usu�rio e em seguida escreva o resultado da 
// soma do primeiro n�mero com o terceiro n�mero  e em seguida multiplique o resultado pelo segundo 
// n�mero informado. Mostre na tela o resultado da aplica��o.

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Primeiro n�mero: ");
		double n1 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Segundo n�mero: ");
		double n2 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Terceiro n�mero: ");
		double n3 = Double.parseDouble(pergunta.nextLine());
		pergunta.close();
		System.out.printf("C�lculo: (%.2f + %.2f) * %.2f = %.2f", n1, n3, n2, ((n1+n3)*n2));
		
		
	}

}
