package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite a idade de um usu�rio e em seguida apresente a idade do usu�rio apos 20 anos.

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.println("Qual a sua idade");
		String idade = pergunta.nextLine();
		int idadeHoje = Integer.parseInt(idade);
		System.out.printf("Hoje voc� tem %d anos e em 20 anos ter� %d anos.", idadeHoje, idadeHoje + 20);
		
		pergunta.close();
	}

}
