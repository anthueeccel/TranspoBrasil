package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite 2 números para o usuário e em seguida escreva o resultado da multiplicação 
// do primeiro número pelo segundo.

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		double numero1 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite o segundo número: ");
		double numero2 = Double.parseDouble(entrada.nextLine());
		entrada.close();
		
		System.out.printf("O resultado da multiplicação de %.2f por %.2f é igual a %.2f ", numero1, numero2, (numero1*numero2));
				
	}

}
