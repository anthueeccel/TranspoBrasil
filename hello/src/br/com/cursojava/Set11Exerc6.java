package br.com.cursojava;
import java.lang.Math;

//Escreva um programa que calcule o valor de 7 elevado na pot�ncia de 5.

public class Set11Exerc6 {		
	
	public static void main(String[] args) {
	    
	    	int b, p;
	    	b = 7;
	    	p = 5;
	        double potencia = Math.pow(b,p);
	        System.out.printf("O n�mero %d elevado ao n�mero %d resulta em %.2f", b, p, potencia);
	    }
	}
