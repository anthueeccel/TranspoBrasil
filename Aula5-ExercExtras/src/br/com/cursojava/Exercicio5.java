package br.com.cursojava;

import java.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



// Crie um programa  que solicite 5 n�meros para o usu�rio e em seguida escreva o maior n�mero digitado.

public class Exercicio5 {
	
	public static void main(String[] args) {
				
		Scanner pergunta = new Scanner(System.in);
						
		int[] arrayN = new int[5];
		int i = 0;
		
		do {
			System.out.printf("%d� n�mero: ", i+1);
			int n = Integer.parseInt(pergunta.nextLine());
			arrayN[i] = n;
			i++;	
						
		} while (i < 5);
		pergunta.close();
		
		System.out.print("N�meros digitados: ");
	      for (i = 0; i < arrayN.length; i++) 
	         System.out.print(arrayN[i] + ", ");    	    
	      
	  	      
	      //List b = Arrays.asList(ArrayUtils.toObject(arrayN));
	      List b = Arrays.asList((arrayN));
	      
	        System.out.println(Collections.min(b));
	        System.out.println(Collections.max(b));
	
	
	
	}
	}