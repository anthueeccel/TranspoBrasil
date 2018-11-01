package br.com.cursojava;

/*Dado as notas 10, 7, 5, 9, 10, 7, 8, 10,10 ,10. Calcule e apresente a soma e a média das notas.*/

public class Set11Exerc3 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 7;
		int n3 = 5;
		int n4 = 9;
		int n5 = 10;
		int n6 = 7;
		int n7 = 8;
		int n8 = 10;
		int n9 = 10;
		int n10 = 10;
		int soma = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10);
		double media = soma/10.0;
		
		System.out.printf("Dadas as notas %d %d, %d, %d, %d, %d, %d, %d, %d, %d\n", n1, n2, n3, n4, n5, n6, n7, n8, n9, n10);
		System.out.printf("A soma das notas é %d e a média final é %.1f", soma, media);
				
	}
}
