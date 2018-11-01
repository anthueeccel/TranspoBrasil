package br.com.cursojava;

// Escreva um programa que imprima o resultado da soma dos 50 primeiros numeros inteiros positivos.

public class Exercicio3 {

	public static void main(String[] args) {
		
		int soma = 0;
		int numero = 1;
		while( numero <= 50) {
			soma += numero; 
			numero++;
		}
		System.out.println("O resultado da soma é " + soma);
		System.out.println("Fim da Aplcação");
		
		
		
		
	}
}
