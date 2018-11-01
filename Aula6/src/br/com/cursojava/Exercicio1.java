package br.com.cursojava;

import java.util.Scanner;

/* Crie um programa que solicite um n�mero entre 1 e 12 em seguida escreva o 
 * nome do m�s correspondente ao n�mero digitado. Caso o usuario infore um n�mero fora do range (1-12) o programa
 * deve apresnetar uma mensagem inficando que o n�mero informado � inv�lido
 */

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero correspondente ao m�s desejado (1 a 12)");
		int dia = Integer.parseInt(teclado.nextLine());
		
		switch(dia) {		
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Mar�o");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Maio");
			break;
		case 6:
			System.out.println("Junho");
			break;
		case 7:
			System.out.println("Julho");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outubro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembor");
			break;	
		default:
			System.out.println("N�mero inv�lido");		
			break;
		}
				
		teclado.close();
		
	}

}
