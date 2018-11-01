package br.com.cursojava;

import java.util.Scanner;

/* Escreva um programa que soilicite um número entre 1 e 3 para o susário. Em seguida escreba uma mensagem 
 * informando o valor da opção selecionada, de acordo com as opções a seguir:
 * 1 - Sacar
 * 2 - Depositar
 * 3 - Verificar Saldo
 * ![1-3] - Opção inválida 
 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a opção [1, 2 ou 3]");
		int opcao = Integer.parseInt(teclado.nextLine());
		
		switch(opcao){
		
		case 1:
			System.out.println("1 - Sacar");
			break;
		case 2:
			System.out.println("2 - Depositar");
			break;
		case 3: 
			System.out.println("3 - Verificar Saldo");
			break;
		default:
			System.out.println("Opção inválida");
			break;			
		}
		
		teclado.close();
	}
	

}
