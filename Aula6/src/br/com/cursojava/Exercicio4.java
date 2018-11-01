package br.com.cursojava;

import java.util.Scanner;

/* Escreva um programa que solicite 3 notas e em seguida calcule e apresente o valor da m�dia das notas. 
 * O programa deve ser executado at� que a primeira nota tenha um valor negativo.
 */

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int nota1 = 0;
		while (nota1 >= 0) {

			System.out.println("Nota 1: ");
			nota1 = Integer.parseInt(teclado.nextLine());
			if (nota1 < 0)
				break;
			
			System.out.println("Nota 2: ");
			int nota2 = Integer.parseInt(teclado.nextLine());
			System.out.println("Nota 3: ");
			int nota3 = Integer.parseInt(teclado.nextLine());

			int media = ((nota1 + nota2 + nota3) / 3);
			System.out.printf("\n\nNotas digitadas: %d, %d, %d, m�dia: %d \n\n\n", nota1, nota2, nota3, media);

		}
		teclado.close();
		System.out.println("Fim da Aplica��o");
	}
}
