package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite a idade do usuário e em seguida apresente uma mensagem informando se
// o usuário pode fazer a CNH. Caso o usuario náo tenha idade suficiente deve ser apresentada uma mensagem
// informando quantos anos faltam para que ele possa solicitar a CNH.


public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("digite sua idade: ");
		int idade = Integer.parseInt(pergunta.nextLine());
		pergunta.close();
				
		if (idade <18) {
			int restaAnos = (18 - idade);			
			System.out.printf("Você não tem idade para requerer CNH, faltam %d ano(s) para poder solicita-la.", restaAnos);			
		}
		else {
			
			System.out.println("Você pode solicitar a CNH");
	    }
	}

}
