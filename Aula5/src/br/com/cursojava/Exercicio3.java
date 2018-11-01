package br.com.cursojava;

import java.util.Scanner;

// Crie um programa que solicite uma frase e em seguida apresente a frase digitada sem as vogais.


public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner frase = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String fraseCompleta = frase.nextLine();
		String fraseSemA = fraseCompleta.replace("a","");	
		String fraseSemAE = fraseSemA.replace("e","");	
		String fraseSemAEI = fraseSemAE.replace("i","");	
		String fraseSemAEIO = fraseSemAEI.replace("o","");	
		String fraseSemAEIOU = fraseSemAEIO.replace("u","");	
		
		System.out.println(fraseSemAEIOU);
		frase.close();
	}
}
