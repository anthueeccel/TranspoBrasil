package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite a idade de um usuário e em seguida apresente a idade do usuário apos 20 anos.

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.println("Qual a sua idade");
		String idade = pergunta.nextLine();
		int idadeHoje = Integer.parseInt(idade);
		System.out.printf("Hoje você tem %d anos e em 20 anos terá %d anos.", idadeHoje, idadeHoje + 20);
		
		pergunta.close();
	}

}
