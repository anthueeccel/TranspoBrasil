package br.com.cursojava;

import java.util.Scanner;

// Crie um programa que solicite 3 notas e em seguida calcule a m�dia das notas. Se a m�dia for maior ou igual a 7
// escreva "Aprovado" se n�o escreva "Reprovado"

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Primeira nota: ");
		double n1 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Primeira nota: ");
		double n2 = Double.parseDouble(pergunta.nextLine());
		System.out.print("Primeira nota: ");
		double n3 = Double.parseDouble(pergunta.nextLine());
		double media = ((n1+n2+n3)/3);
		pergunta.close();
		
		System.out.printf("Notas digitadas: %.1f, %.1f, %.1f \nM�dia %.1f \n", n1, n2, n3, media);
		
		if (media >= 7) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}
		
	}
	
	

}
