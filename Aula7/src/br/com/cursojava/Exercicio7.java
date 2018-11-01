package br.com.cursojava;
/* Crie um programa que imprima os valores abaixo no console:
 * X
 * XX
 * XXX
 * XXXX
 * XXXXX
 */

public class Exercicio7 {

	public static void main(String[] args) {

		String letra = "#";
		for (int i1 = 5; i1 > 0; i1--) {
			System.out.println("");
			for (int i = i1; i > 0; i--) {
				System.out.print(letra);
			}
		}
	}
}
