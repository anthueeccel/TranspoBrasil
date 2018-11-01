package br.com.cursojava;

import java.util.Scanner;

public class ExemploExcecoes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite um numero");
//		int numero = Integer.parseInt(teclado.nextLine());
//		System.out.println("O n�mero digitado foi " + numero);

		try {
			String[] nomes = { "Jo�o", "Maria" };
			System.out.println(Integer.parseInt("dois"));
			System.out.println(nomes[2]);

		} catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {  //Determina-se a exce��o ou Throwable para todas
			System.out.println("Voc� tentou acessar uma posi��o inv�lida " + ex);
			System.out.println(ex.getClass() + ex.getMessage());
		} 
//		catch (NumberFormatException e) {
//			System.out.println("Valor informado n�o pode ser convertido");
//		}
		System.out.println("C�digo continuou normalmente");
		teclado.close();
	}

}
