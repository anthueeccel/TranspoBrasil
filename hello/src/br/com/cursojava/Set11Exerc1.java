package br.com.cursojava;

/*Dado um ret�ngulo de base 20 e altura 30 escreva um programa que calcule e apresente os seguintes valores:
 * a) A �rea do ret�ngulo. 
 * b) o per�metro do ret�ngulo.*/


public class Set11Exerc1 {
	
	public static void main(String[] args) {
		
		double b = 20.0;
		double a = 30.0;
		double area = (b*a);
		double perimetro = (2*b + 2*a);
		System.out.printf("A �rea do ret�ngulo de base igual a %.1f e altura igual a %.1f � %.2f e seu "
				+ "per�metro � de %.1f", b, a, area, perimetro);		
		
	}
}
