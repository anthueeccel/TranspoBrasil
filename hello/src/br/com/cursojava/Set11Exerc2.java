package br.com.cursojava;

/*Dado um círculo de 30cm de diâmetro calcule e apresente o valor da área deste círculo.*/

public class Set11Exerc2 {
	
	public static void main(String[] args) {
		
		double d = 30.0;
		double area = ((d/2)*(d/2))/3.14;
		
		System.out.printf("Um círculo com %.1f de diâmetro tem uma área de %.1f", d, area);
				
	}
}
