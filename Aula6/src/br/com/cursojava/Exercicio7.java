package br.com.cursojava;
/* Escreva um prorama que apresente o meno abaixo para o usuário, e após a escolha do usuário apresente 
 * uma mensagem correspondente ao tipo de operação selecionada. O programa deve continuar executando até 
 * que o usuário escoha a opção sair. Caso a opção seja invalida apresentar na tela: Opção inválida.
 * 1 - Cadastrar	Aluno 	-> Escolheu a opção Cadastrar Aluno
 * 2 - Cadastrar Professor 	-> Escolheu a opção Cadastrar Professor
 * 3 - Cadastrar Turma		-> Escolheu a opção Cadastrar Turma
 * 4 - Sair
 */

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int opcao = 0;

		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Digite a opção: \n1 - Cadastrar Aluno \n2 - Cadastrar Professor \n"
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
				System.out.println("Opção Invalida");
				break;
			}
		} while (opcao != 4);

		System.out.println("Fim da Aplicação");
		teclado.close();

	}
}
