package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite 2 n�meros para o usu�rio e em seguida escreva o resultado da multiplica��o 
// do primeiro n�mero pelo segundo.

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o primeiro n�mero: ");
		double numero1 = Double.parseDouble(entrada.nextLine());
		System.out.print("Digite o segundo n�mero: ");
		double numero2 = Double.parseDouble(entrada.nextLine());
		entrada.close();
		
		System.out.printf("O resultado da multiplica��o de %.2f por %.2f � igual a %.2f ", numero1, numero2, (numero1*numero2));
				
	}

}
