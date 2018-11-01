package br.com.cursojava;

import java.util.Scanner;

// Elaborar um jogo da velha. 

public class Prova1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String[][] tabuleiro = { { "1", "2", "3" }, { "4", "5", "6" }, { "7", "8", "9" } };
		String[] nomeJogador = { "X", "O" };
		int j = 0;		
		int jogada = 99;
		

		do {
			System.out.println("\n\nDigite um numero correspondente a posição \nPara sair do jogo: 11");
			System.out.println(" ----------");
			for (int x = 0; x < tabuleiro.length; x++) {
				System.out.print("| ");
				for (int y = 0; y < tabuleiro.length; y++) {
					System.out.print(tabuleiro[x][y] + " | ");
				}

				System.out.println("");
				System.out.println(" ----------");

			}
			System.out.print("Jogador " + nomeJogador[j] + " digite um número: ");
			jogada = Integer.parseInt(teclado.nextLine());

			if (jogada == 1 && tabuleiro[0][0].equals("1")) {
				tabuleiro[0][0] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 2 && tabuleiro[0][1].equals("2")) {
				tabuleiro[0][1] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 3 && tabuleiro[0][2].equals("3")) {
				tabuleiro[0][2] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 4 && tabuleiro[1][0].equals("4")) {
				tabuleiro[1][0] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 5 && tabuleiro[1][1].equals("5")) {
				tabuleiro[1][1] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 6 && tabuleiro[1][2].equals("6")) {
				tabuleiro[1][2] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 7 && tabuleiro[2][0].equals("7")) {
				tabuleiro[2][0] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 8 && tabuleiro[2][1].equals("8")) {
				tabuleiro[2][1] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}
			if (jogada == 9 && tabuleiro[2][2].equals("9")) {
				tabuleiro[2][2] = nomeJogador[j];
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
			}

			if (tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][1].equals(tabuleiro[0][2])) {
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
				break;
			}
			if (tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[1][2])) {
				// alterna entre jogador A e jogador B
				if (j == 0) {
					j = 1;	
					nomeJogador[j] = "O";
				} else {
					j = 0;		
					nomeJogador[j] = "X";
				}
				break;
			}
			if (tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][1].equals(tabuleiro[2][2])) {
				break;
			}
			///////////////////////////////
			if (tabuleiro[0][0].equals(tabuleiro[1][0]) && tabuleiro[1][0].equals(tabuleiro[2][0])) {
				break;
			}
			if (tabuleiro[0][1].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][1])) {
				break;
			}
			if (tabuleiro[0][2].equals(tabuleiro[1][2]) && tabuleiro[1][2].equals(tabuleiro[2][2])) {
				break;
			}
			////////////////////////////////
			if (tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[2][2])) {
				break;
			}
			if (tabuleiro[2][0].equals(tabuleiro[1][1]) && tabuleiro[1][1].equals(tabuleiro[0][2])) {
				break;
			}

		
			// sai do jogo
		} while (jogada < 10);
		teclado.close();
		
		
		// alterna entre jogador A e jogador B
		if (j == 1) {
			j = 0;	
			nomeJogador[j] = "O";
		} else {
			j = 1;		
			nomeJogador[j] = "X";
		}
		System.out.println(" Ganhador foi o jogador " + nomeJogador[j]);
		System.out.println(" ----------");
		for (int x = 0; x < tabuleiro.length; x++) {
			System.out.print("| ");
			for (int y = 0; y < tabuleiro.length; y++) {
				System.out.print(tabuleiro[x][y] + " | ");
			}

			System.out.println("");
			System.out.println(" ----------");

		}
		System.out.println(" Ganhador foi o jogador " + nomeJogador[j]);

	}
}
