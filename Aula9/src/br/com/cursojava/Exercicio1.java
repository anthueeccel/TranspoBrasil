package br.com.cursojava;

import java.util.Scanner;

/* Escreva um programa que solicite 3 notas para uma turma de 10 alunos e em seguida calcule a m�dia de cada
 * aluno juntamente com a m�dia da turma. Ao final o programa deve apresentar as 3 notas do aluno juntamnte com
 * sua m�dia e posteriormente deve presentar a m�dia final da turma.
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
		
		double[][] notas = new double[10][3];
		double somaTurma = 0;
		double somaAluno = 0;
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		for (int aluno = 0; aluno <= notas.length -1; aluno++) {
			for (int nota = 0; nota <= notas[aluno].length -1; nota++) {
				System.out.printf("Aluno %d. Digite a %d� nota: ", aluno +1, nota +1);
				notas[aluno][nota] = Double.parseDouble(teclado.nextLine());				
				somaTurma += notas[aluno][nota];
				contador++;				
				}				
			}
					
		for (int aluno = 0; aluno <= notas.length -1; aluno++) {
			int contadorNotas = 0;
			somaAluno = 0;
			for (int nota = 0; nota <= notas[aluno].length -1; nota++) {								
				somaAluno += notas[aluno][nota];
				contadorNotas++;				
				}
			System.out.printf("Aluno %d. M�dia: %.1f \n", aluno +1, somaAluno/contadorNotas);	
			}
				
		double media = somaTurma/contador;		
		System.out.println("M�dia da turma: " + media);
		
		teclado.close();		
	}

}
