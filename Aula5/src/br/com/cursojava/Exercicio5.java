package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite um n�mero e em seguida apresente uma mensagem informando se o n�mero digitado
// foi "PAR"ou "IMPAR". todo n�meo PAR deve ter o resto da divis�o por 2 igual a zero.

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int numero = Integer.parseInt(pergunta.nextLine());
		pergunta.close();
		
		int resto = (numero % 2);		
		
	    if (resto == 0) {				    	
	    	System.out.print("Este n�mer � PAR");
		} else {
			System.out.print("Este n�mero � IMPAR");
		}
		
		
	}
	
	

}
