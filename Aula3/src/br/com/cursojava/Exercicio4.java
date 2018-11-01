package br.com.cursojava;

import java.util.Scanner;

//Escreva um programa que solicite a idade do usuário em anos e apresente o valor da idade informada em meses
// (ex.: 1 an = 12 meses)

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idadeMeses = Integer.parseInt(input.nextLine());
		System.out.printf("Você tem %d meses de vida.", idadeMeses*12);
		input.close();
	}

}
