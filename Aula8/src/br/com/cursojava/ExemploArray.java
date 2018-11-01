package br.com.cursojava;

public class ExemploArray {

	public static void main(String[] args) {

		int[] numeros;
		String nomes[];
		numeros = new int[10];
		nomes = new String[3];

		String[] frutas = { "Abacaxi", "Banana", "Pëssego" };
		double[] medias = new double[3];
		int[] notas = { 10, 9, 8, 10, 9, 8 };
		int[] notas2 = { 10, 9, 8, 10, 9, 8 };

		System.out.println(notas.length); // saber o tamanho/capacidade do Array
		System.out.println(frutas.length); // saber o tamanho/capacidade do Array

//				notas = new int[] {100};
//				System.out.println(notas);

		// cria a array com 4 elementos e em seguida atribui a posição 1 a y
		int y = new int[] { 10, 9, 8, 7 }[1];

		for (int index = 0; index < 6; index++) {
			System.out.print(notas[index] + " ");
		}
		System.out.println("");

		for (int index = 0; index < notas.length; index++) {
			System.out.print(notas[index] + " ");
		}
		// repete o for acima mas sem acessar os índices/posições
		System.out.println(" ");
		for (int atual : notas) {
			System.out.println(atual + " ");
			
			// equivale ao código FOR acima
			//for (int i = 0; i < notas.length; i++) {
			//	int atual = notas[i];
			//	System.out.println(atual + " ");
			//}

		}
	}
}
