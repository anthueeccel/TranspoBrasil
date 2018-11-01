package br.com.cursojava;

import java.util.Arrays;
import java.util.Scanner;

/* Crie um programa que solicite o nome de 10 pessoas e em seguida apresente os nomes informados na ordem inversa.
 * (O último nome deve ser o primeiro).
 */
public class Exercicio4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] nome = new String[5];

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Digite o %dº nome: ", i + 1);
			nome[i] = input.nextLine();
		}
		input.close();
		System.out.println("Ordem digitada dos nomes");
		for (int i = nome.length - 1; i >= 0; i--) {
			System.out.print(i + 1 + "º nome digitado: " + nome[i] + "\n");
		}

		System.out.println("Ordem crescente após uso do método Arrays.sort");
		Arrays.sort(nome);
		for (int i = 0; i < nome.length; i++) {
			System.out.print(i + 1 + "º nome: " + nome[i] + "\n");

		}
		System.out.println("");
		System.out.println(Arrays.toString(nome));
	}
}
