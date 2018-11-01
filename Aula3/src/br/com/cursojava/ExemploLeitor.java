package br.com.cursojava;

// Nome qualificado da classe (nome completo, ex.: br.com.cursojava.ExemploLeitor)
import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main(String[] args) {
		
		// System.in monitora a entrada padrão do sistema
		// Scanner sempre retorna uma String
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = teclado.nextLine();
		System.out.printf("O nome digitado foi %s \n", nome);		
		teclado.close();
	}

}
