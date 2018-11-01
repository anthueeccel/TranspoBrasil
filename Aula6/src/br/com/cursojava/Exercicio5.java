package br.com.cursojava;

// Escreva um programa que escreva todos os numeros impares entre 1 e 100.

public class Exercicio5 {

	public static void main(String[] args) {

		int numero = 1;		
		while (numero <= 100) {
			System.out.print(numero + ", ");
			numero += 2;
		}
	}
}
