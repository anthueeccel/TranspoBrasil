package br.com.cursojava;

// utilizando a classe Math crie um programa que apresente o valor inteiro referente ao numero 13.36543

public class set11Exerc7b {
	
	public static void main(String[] args) {
		
		double a = 13.86543;
		float inteiro = Math.round(a);
		System.out.printf("O inteiro de %.5f é %.0f\n", a, inteiro);
		System.out.printf("O inteiro de %.5f = %d", a,(int)Math.floor(a));
		
	}
	

}
