package br.com.cursojava;
/* Escreva um prorama que apresente o meno abaixo para o usu�rio, e ap�s a escolha do usu�rio apresente 
 * uma mensagem correspondente ao tipo de opera��o selecionada. O programa deve continuar executando at� 
 * que o usu�rio escoha a op��o sair. Caso a op��o seja invalida apresentar na tela: Op��o inv�lida.
 * 1 - Cadastrar	Aluno 	-> Escolheu a op��o Cadastrar Aluno
 * 2 - Cadastrar Professor 	-> Escolheu a op��o Cadastrar Professor
 * 3 - Cadastrar Turma		-> Escolheu a op��o Cadastrar Turma
 * 4 - Sair
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int opcao = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Digite a op��o: \n1 - Cadastrar Aluno \n2 - Cadastrar Professor \n"
					+ "3 - Cadastrar Turma \n4 - Sair \n");
			opcao = Integer.parseInt(teclado.nextLine());
			switch (opcao) {
			case 1:
				System.out.println("1 - Cadastrar Aluno");
				break;
			case 2:
				System.out.println("2 - Cadastrar Professor");
				break;
			case 3:
				System.out.println("3 - Cadastrar Turma");
				break;
			case 4:
				System.out.println("");
				break;
			default:
				System.out.println("Op��o Invalida");
				break;
			}
		} while (opcao != 4);

		System.out.println("Fim da Aplica��o");
		teclado.close();

	}
}
