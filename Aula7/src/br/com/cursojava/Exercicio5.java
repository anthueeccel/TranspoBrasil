package br.com.cursojava;

import java.util.Scanner;

/* Crie um programa que solicite um palavra e em seguida escreva a palavra de forma inversa. (Ex. Felipe => epileF) */


public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		teclado.close();	
				
		for (int i = palavra.length() - 1; i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}	
	}	
}
