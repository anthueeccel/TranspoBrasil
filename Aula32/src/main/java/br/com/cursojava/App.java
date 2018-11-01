package br.com.cursojava;

import java.util.Scanner;

public class App {
		
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			Main cadastro = new Main();
			cadastro.mostrarMenu(teclado);
			teclado.close();
		}

	}


