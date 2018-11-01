package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite 3 notas de um aluno e em seguida calcule a média das notas. 
// Caso a média seja maior ou igual a 9 escreva Excelente, 
// caso a média seja maior ou igual a 8 e menor que 9 escreva "Muito Bom", 
// caso a nota seja maior ou igual a 6 e menor que 8 escreva "Bom", 
// caso a nota seja menor que 6 escreva "Insuficiente".

public class Exercicio3 {
	
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
			System.out.println("Excelente");
		} else if (media < 9 && media >= 8) {
			System.out.println("Muito bom");
		} else if (media < 8 && media >= 6){
			System.out.println("Bom");			
		} else {
			System.out.println("Insuficiente");
		}
				
	}


}
