package br.com.cursojava;

import java.util.Scanner;

public class ExemploExcecoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite um numero");
//		int numero = Integer.parseInt(teclado.nextLine());
//		System.out.println("O número digitado foi " + numero);

		try {
			String[] nomes = { "João", "Maria" };
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {  //Determina-se a exceção ou Throwable para todas
			System.out.println("Você tentou acessar uma posição inválida " + ex);
			System.out.println(ex.getClass() + ex.getMessage());
		} 
//		catch (NumberFormatException e) {
//			System.out.println("Valor informado não pode ser convertido");
//		}
		System.out.println("Código continuou normalmente");
		teclado.close();
	}

}
