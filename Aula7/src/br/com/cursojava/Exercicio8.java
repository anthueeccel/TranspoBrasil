package br.com.cursojava;
/* Crie um programa que imprima os valores abaixo no console:
 * #####
 * ####
 * ###
 * ##
 * #
 */

public class Exercicio8 {

	public static void main(String[] args) {

		String letra = "#";
		for (int i1 = 1; i1 < 5; i1++) {
			System.out.println("");
			for (int i = i1; i < 5; i++) {
				System.out.print(letra);
			}
		}
	}

}
