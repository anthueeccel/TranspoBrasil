package br.com.cursojava;

import java.util.Scanner;

// Crie um programa que solicite 3 notas e em seguida calcule a média das notas. 
// Caso a nota seja maior ou igual a 9 apresente a mensagem "Conceito A", 
// caso a nota seja menor que 9 e maior ou igual a 7 apresente a mensagem "Conceito B", 
// caso a nota seja menor que 7 e maior ou igual a 6 apresente a mensagem "Conceito C",
// caso a nota seja menor que 6 e maior ou igual a 5 apresente a mensagem "Conceito D", 
// senão apresente a mensagem "Conceito Insuficiente".

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		double n1 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Segunda nota: ");
		double n2 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Terceira nota: ");
		double n3 = Double.parseDouble(pergunta.nextLine());		
		pergunta.close();
		
		double media = (n1 + n2 + n3)/3;
		System.out.printf("Média: %.2f ", media);
		
		if (media >= 9) {
			System.out.println("Conceito A");
		} else if (media < 9 && media >= 7) {
			System.out.println("Conceito B");
		} else if (media < 7 && media >= 6){
			System.out.println("Conceito C");			
		} else if (media < 6 && media >= 5){
			System.out.println("Conceito D");			
		} else {
			System.out.println("Conceito Insuficiente");
		}
				
	}
}
