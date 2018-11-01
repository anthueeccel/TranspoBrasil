package br.com.cursojava;

import java.util.Scanner;

public class ExemploSwitch {
	
	private static final int INICIAL = 1;
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero ente 1 e 7");
		int dia = Integer.parseInt(teclado.nextLine());
		
		switch(dia) {
		// somente aceita vari�vel se ela for uma constante.
		case INICIAL:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Ter�a-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�mero inv�lido");		
			break;
		}
				
		teclado.close();
		
	}

}
