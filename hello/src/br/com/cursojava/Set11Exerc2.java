package br.com.cursojava;

/*Dado um c�rculo de 30cm de di�metro calcule e apresente o valor da �rea deste c�rculo.*/

public class Set11Exerc2 {
	
	public static void main(String[] args) {
		
		double d = 30.0;
		double area = ((d/2)*(d/2))/3.14;
		
		System.out.printf("Um c�rculo com %.1f de di�metro tem uma �rea de %.1f", d, area);
				
	}
}
