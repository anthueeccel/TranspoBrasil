package br.com.cursojava;

import java.util.Scanner;

// Crie um programa que solicite o nome do usuário e em seguida informe a quantidade de letras do nome informado.

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu nome:");		
		System.out.println(input.nextLine().length());
		
		
		input.close();
	}
	

}
