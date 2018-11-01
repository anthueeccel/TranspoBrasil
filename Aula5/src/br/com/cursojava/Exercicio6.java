package br.com.cursojava;

import java.util.Scanner;

// Escreva um programa que solicite a idade, a altura e o peso de uma pessoa, em seguida calcule o IMC utilizando
// a fórmula IMC = peso/(altura*altura). O programa deve apresentar uma mensagem conforme tabela abaixo:
// Abaixo de 17	Muito abaixo do peso
// Entre 17 e 18,49	Abaixo do peso
// Entre 18,5 e 24,99	Peso normal
// Entre 25 e 29,99	Acima do peso
// Entre 30 e 34,99	Obesidade I
// Entre 35 e 39,99	Obesidade II (severa)
// Acima de 40	Obesidade III (mórbida)


public class Exercicio6 {
	
	public static void main(String[] args) {
			
	Scanner pergunta = new Scanner(System.in);
	System.out.print("Digite seu peso (kg): ");
	double peso = Double.parseDouble(pergunta.nextLine());
	System.out.print("Digite sua altura (metro): ");
	double altura = Double.parseDouble(pergunta.nextLine());
	pergunta.close();
	
	double imc = (peso/(altura*altura));
	System.out.printf("IMC = %.3f \n", imc);
	
	if (imc < 17) {
		System.out.println("Você está muito abaixo do peso");
	} else if (imc >= 17 && imc <= 18.49) {
		System.out.println("Você está abaixo do peso");
	} else if (imc >= 18.5 && imc <= 24.99) {
		System.out.println("Você está com peso normal ");
	} else if (imc >= 25 && imc <= 29.99) {
		System.out.println("Você está acima do peso");
	} else if (imc >= 30 && imc <= 34.99) {
		System.out.println("Você está com Obesidade I");
	} else if (imc >= 35 && imc <= 39.99) {
		System.out.println("Você está com Obesidade I (severa)");
	} else {
		System.out.println("Você está com Obesidade III (mórbida)");
	}
		
	}
}
