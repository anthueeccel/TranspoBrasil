package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite o valor de um produto e o percentual de desconto, em seguida o 
// programa deve apresentar o valor do desconto e o valor do produto após a aplicação do desconto.

public class Exercicio6 {
	
	public static void main(String[] args) {
		
	
	Scanner questao = new Scanner(System.in);
	System.out.println("Valor do produto:");
	double valorP = Double.parseDouble(questao.nextLine());
	System.out.println("Percentual de desconto:");
	double descontoPercentual = Double.parseDouble(questao.nextLine());
	double valorFinal = (valorP-(valorP*(descontoPercentual/100)));
	System.out.printf("\n-----------------------\nValor do Produto %.2f \nPercentual de desconto: %.1f \nValor final c/ desconto: %.2f \n-----------------------", valorP, descontoPercentual, valorFinal);
	
	questao.close();
	}
}
