package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite a idade do usuário em dias e em seguida apresente o valo em dias meses e ano. 
// Considere que cada mês tem 30 dias e que um ano equivale a 12 meses.

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.println("Quantos dias de vida você tem?");
		int idadeDias = Integer.parseInt(pergunta.nextLine());
		int idadeMeses = idadeDias/30;
		int idadeAnos = idadeMeses/12;
		System.out.printf("Você já viveu %d dias ou %d meses ou %d anos até hoje.", idadeDias, idadeMeses, idadeAnos);
				
		pergunta.close();
		
	}
	

}
