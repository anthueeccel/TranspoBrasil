package br.com.cursojava;

import java.util.Scanner;

public class AppVeiculo {

	public static void main(String[] args) {
		
		


		Scanner teclado = new Scanner(System.in);
		VeiculoCadastro cadastro = new VeiculoCadastro();
		cadastro.mostrarMenu(teclado);
		teclado.close();
	}

}
