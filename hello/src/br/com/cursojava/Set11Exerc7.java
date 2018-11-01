package br.com.cursojava;

// Utilizando a classe Math, crie um programa que calcule e apresente 
// o maior número entre 10, 20 e 15

public class Set11Exerc7 {
	
	public static void main(String[] args) { 
		
		int a, b, c;
		a = 10;
		b = 20;
		c = 15;
		
		//int result1 = Math.max(a, b);
		//int result2 = Math.max(result1, c);	
		
		int result2 = Math.max(Math.max(a, b), c);
		
		System.out.printf("Entre os números %d, %d, %d o maior é o número %d", a, b, c, result2);		
	}
}