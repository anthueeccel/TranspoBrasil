package br.com.cursojava;

import java.util.Scanner;

//Escreva um programa que solicite 3 notas e em seguida calcule e apresente os seguintes dados:
// a) O valor da média
// b) O valor da maior nota (Math.max)
// c) O valor da menor nota (Math.min)

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Primeira nota: ");
		float n1 = Float.parseFloat(input.nextLine());
		System.out.println("Segunda nota: ");
		float n2 = Float.parseFloat(input.nextLine());
		System.out.println("Terceira nota: ");
		float n3 = Float.parseFloat(input.nextLine());
		
		float nMax1 = Math.max(n1, n2);
		float nMax = Math.max(n3, nMax1);
		
		float nMin1 = Math.min(n1, n2);
		float nMin = Math.min(nMin1, n3);
		
		System.out.printf("Notas digitadas: %.1f, %.1f, %.1f \nMédia: %.1f \nMaior nota: %.1f \nMenor nota: %.1f", n1, n2, n3, ((n1+n2+n3)/3),nMax, nMin);
			
		input.close();
		
		
	}

}
