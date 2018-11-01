package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite o valor do salário de uma pessoa e calcule o valor do imposto de renda
// conforme os dados abaixo:
// até 1800,00 = isento
// de 1.800,01 até 2.400,00 = 7.5%;
// de 2.400,01 até 3.600,00 = 15%;
// acima de 3.600,00 = 27%;


public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner pergunta = new Scanner(System.in);
		System.out.print("Qual o seu salário bruto (antes dos Impostos):  ");
		double salarioBruto = Double.parseDouble(pergunta.nextLine());		
		pergunta.close();
							
		if (salarioBruto <= 1800) {
			System.out.println("Isento de IR.");
		} 
		else if (salarioBruto > 1800 && salarioBruto <= 2400) {			
			double irPagar = (salarioBruto * 0.075);
			System.out.printf("IR a pagar R$%.2f", (irPagar));
			
		} else if (salarioBruto > 2400 && salarioBruto <= 3600) {
			double irPagar = (salarioBruto * 0.15);						
			System.out.printf("IR a pagar R$%.2f", (irPagar));		
			
		} else {
			double irPagar = (salarioBruto * 0.27);					
			System.out.printf("IR a pagar R$%.2f ", irPagar);			
		}		
   }
}
