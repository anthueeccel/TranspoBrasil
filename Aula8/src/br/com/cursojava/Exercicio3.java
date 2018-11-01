package br.com.cursojava;


import java.util.Scanner;

/* Crie um programa que solicite 5 notas e em seguida apresente o valor da maior nota juntamente com a posição 
 * da nota dentro do array.
 */
public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double[] notas = new double[5];		
		int posMaior = 0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %dª nota: ", i+1);
			notas[i] = Double.parseDouble(teclado.nextLine());
			if (notas[i] > notas[posMaior])	{			
			   posMaior = i;
			}
		}
		teclado.close();
		
		System.out.println("Maior nota: " + notas[posMaior] + " e a posição no índice (Array) é " + posMaior );
		
	}	
}
