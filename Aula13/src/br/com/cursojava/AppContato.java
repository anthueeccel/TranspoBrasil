package br.com.cursojava;

import java.util.Scanner;

public class AppContato {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		ContatoCadastro cadastro = new ContatoCadastro();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}
