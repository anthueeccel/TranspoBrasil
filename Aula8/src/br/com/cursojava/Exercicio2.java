package br.com.cursojava;

import java.util.Arrays;

/* Crie um programa que crie um array com os valores 1,3,2 e em seguida processe o array para que os valores
 * se posicionem na forma 3,2,1.
 */
public class Exercicio2 {

	public static void main(String[] args) {

		int[] array = { 1, 3, 2, 5, 4 };

		System.out.println("Ordenando de forma manual");
		System.out.print(array[3] + ", ");
		System.out.print(array[4] + ", ");
		System.out.print(array[1] + ", ");
		System.out.print(array[2] + ", ");
		System.out.print(array[0] + ". ");
		System.out.println("");

		System.out.println("Ordenando ao criar temporário para trocar os números pelo seguinte SE maior.");
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		for (int i = array.length - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.print(array[i] + ". ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}
		System.out.println("");
		System.out.println("Imprimir com método Arrays.toString");
		System.out.println(Arrays.toString(array));
		
		System.out.println("Ordenando ao usar método Arrays.sort");
		Arrays.sort(array);
		for (int i = array.length - 1; i >= 0; i--) {
			if(i == 0) {
				System.out.print(array[i] + ". ");
			} else {
				System.out.print(array[i] + ", ");
			}
		}

	}
}
