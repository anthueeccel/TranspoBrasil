package br.com.cursojava;

import java.util.Scanner;

// Crie um programa que solicite um número entre 1 e 20 e em seguida calcule e apresente o valor do fatorial do 
// número informado.

public class Exercicio1 {

	public static void main(String[] args) {
				
		Scanner teclado = new Scanner(System.in);
		long fatorial = 1;
		int numero = -1;
		do {
			System.out.println("Digite um numero entre 1 e 20");
			numero = Integer.parseInt(teclado.nextLine());
				
		} while(numero < 1 || numero > 20);		
		teclado.close();
		
		for(int i = 1; i <= numero; i++) {
			fatorial *= i;			
		} 
		System.out.println(fatorial);
		
	}
	
	
}
