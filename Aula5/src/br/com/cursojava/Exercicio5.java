package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite um número e em seguida apresente uma mensagem informando se o número digitado
// foi "PAR"ou "IMPAR". todo númeo PAR deve ter o resto da divisão por 2 igual a zero.

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = Integer.parseInt(pergunta.nextLine());
		pergunta.close();
		
		int resto = (numero % 2);		
		
	    if (resto == 0) {				    	
	    	System.out.print("Este númer é PAR");
		} else {
			System.out.print("Este número é IMPAR");
		}
		
		
	}
	
	

}
