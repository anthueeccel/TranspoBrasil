package br.com.cursojava;

import java.util.Scanner;

/* Crie um programa que solicite 10 notas e em seguida calcule a média das notas e escreva as notas digitadas
 * juntamente com o valor da média.
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[10];
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", i+1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			soma += notas[i];
		}		
		
		double media = (soma/notas.length);
		
		for (double nota : notas) {
			System.out.println(nota + " ");
		}
		
		System.out.println(" ");
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		
	teclado.close();
	}

}
