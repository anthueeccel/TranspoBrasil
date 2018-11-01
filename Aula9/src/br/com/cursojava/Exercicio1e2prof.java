//package br.com.cursojava;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Exercicios {
//	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//		exercicio02();
//		teclado.close();
//	}
//
//	public static void exercicio01(Scanner teclado) {
//		double[][] turma = new double[3][3];
//		double[] medias = new double[turma.length];
//		double mediaGeral = 0;
//
//		for (int aluno = 0; aluno < turma.length; aluno++) {
//			for (int nota = 0; nota < turma[aluno].length; nota++) {
//				System.out.printf("Informe a nota %d do aluno %d\n", nota + 1, aluno + 1);
//				turma[aluno][nota] = Double.parseDouble(teclado.nextLine());
//				medias[aluno] += turma[aluno][nota];
//				mediaGeral += turma[aluno][nota];
//			}
//			medias[aluno] /= turma[aluno].length;
//		}
//		mediaGeral /= turma.length * turma[0].length;
//
//		for (int aluno = 0; aluno < turma.length; aluno++) {
//			System.out.printf("As notas do aluno %d foram:\n", aluno + 1);
//			for (int nota = 0; nota < turma[aluno].length; nota++) {
//				System.out.printf("%.2f ", turma[aluno][nota]);
//			}
//			System.out.println("Sua m�dia foi :"+medias[aluno]);
//		}
//		System.out.println("M�dia geral da turma: "+mediaGeral);
//	}
//	
//	/*
//	 * 02) Data a tabela abaixo:
//			     meias  camisas  camisetas
//			Jan  100     200        150
//			Fev   75     260        100 
//			Mar  150     200        250
//			Abr   50     210        240
//			
//			Calcule as seguintes opera��es:
//			  a) A quantidade de pe�as vendidas
//			  b) A quantidade de meias vendidas
//			  c) A quantidade de pe�as vendidas m�s a m�s
//			  d) A quantidade de camisas + a quantidade de camisetas vendidas m�s a M�s
//			  e) O tipo de pe�a mais vendido em cada M�s
//	 * 
//	 * */
//	public static void exercicio02(){
//		
//		int[][] tabela = {{100,200,150},{75,260,100},{150,200,250},{50,210,240}};
//		int total = 0;
//		int totalMeias = 0;
//		int[] pecasMes = new int[tabela.length];
//		int[] camisasCamisetaMes = new int[tabela.length];
//		int[] maiorPorMes = new int[tabela.length];
//		int meia = 0;
//		
//		
//		for (int mes = 0; mes < tabela.length; mes++) {
//			int maior = 0;
//			for (int tipo = 0; tipo < tabela[mes].length; tipo++) {
//				total += tabela[mes][tipo];
//				pecasMes[mes] += tabela[mes][tipo];
//				if(tabela[mes][tipo] > tabela[mes][maior]){
//					maior = tipo;
//				}
//				if(tipo == meia){
//					totalMeias+= tabela[mes][tipo];
//				}else{
//					camisasCamisetaMes[mes] += tabela[mes][tipo];
//				}
//			}
//			maiorPorMes[mes] = maior;
//		}
//		
//		System.out.println("Quantidade de pe�as vendidas: "+total);
//		System.out.println("A quantidade de meias vendidas foi: "+totalMeias);
//		System.out.println("Total de pe�as vendidas por m�s");
//		System.out.println(Arrays.toString(pecasMes));
//		System.out.println("Total de Camisas + Camisetas vendidas por m�s");
//		System.out.println(Arrays.toString(camisasCamisetaMes));
//		System.out.println("Produto mais vendido M�s a M�s");
//		for (int i = 0; i < maiorPorMes.length; i++) {
//			String nome = "";
//			switch(maiorPorMes[i]){
//			case 0:
//				nome = "Meias";
//				break;
//			case 1:
//				nome = "Camisas";
//				break;
//			case 2:
//				nome = "Camisetas";
//				break;
//			}
//			System.out.printf("m�s %d => %s\n",i,nome);
//			
//		}
//		
//	}
//}
