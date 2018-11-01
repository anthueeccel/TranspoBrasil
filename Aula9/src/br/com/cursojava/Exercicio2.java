package br.com.cursojava;

/* Dada a tabela abaixo:
 * 
 *  	meias	camisas	camisetas
 *  Jan	100		200		150
 *  Fev	 75		260		100
 *  Mar	150		200		250
 *  Abr	 50		210		240
 *  
 *  Calcule as seguintes operações:
 *  a) A quantidade de peças vendidades;
 *  b) A quantidade de meias vendidas;
 *  c) A quantidade de peças vendidas mês a mês;
 *  d) A quantidade de camisas + a quantiadade de camisetas vendidas mês a mês;
 *  e) O tipo de peça mais vendida em cada mês.
 */

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		//      vendas         meias            camisas           camisetas
		int[][] vendas = {{100,75,150,50},{200,260,200,210},{150,100,250,240}};
				
		int[] somaMes = new int[4];
		int pecasTotal = 0;
		int[] somaTipo = new int[3];
		int[] somaCamisaCamiseta = new int [4];
		int[]TipoMaisVendido = new int[4];			
		int meia = 0;		
		int maior = 0;
		for (int tipo = 0; tipo <= vendas.length -1; tipo++) {
			int mes = 0;
			for (; mes <= vendas[tipo].length -1; mes++) {
				somaMes[mes] += vendas[tipo][mes];				
				pecasTotal += vendas[tipo][mes];
				
				if(vendas[tipo][mes] > vendas[maior][mes]) {
					maior = tipo;
				}
				if(tipo == meia) {
					somaTipo[tipo] += vendas[tipo][mes];
				}
				else {
					somaCamisaCamiseta[mes] += vendas[tipo][mes];
				}
				
				
			}
			TipoMaisVendido[mes-1] = maior;
		}
			
		
		System.out.printf("a) Total de peças vendidas: %d \n\n", pecasTotal);
		System.out.printf("b) Total de meias vendidas: %d \n\n ", somaTipo[0]);
		System.out.printf("c) Vendas por mês (total): \n  Janeiro: %d \n  Fevereiro: %d \n  Março: %d \n  Abril: %d \n\n",somaMes[0],somaMes[1],somaMes[2],somaMes[3]);
		System.out.printf("d) Vendas por mês (camisas + camisetas): \n  Janeiro: %d \n  Fevereiro: %d \n  Março: %d \n  Abril: %d",somaCamisaCamiseta[0],somaCamisaCamiseta[1],somaCamisaCamiseta[2],somaCamisaCamiseta[3]);
		System.out.println("\n");
		System.out.println("e) Produto mais vendido Mês a Mês");
		for (int i = 0; i < TipoMaisVendido.length; i++) {
			String nome = "";
			switch(TipoMaisVendido[i]){
			case 0:
				nome = "Meias";
				break;
			case 1:
				nome = "Camisas";
				break;
			case 2:
				nome = "Camisetas";
				break;
			}
			System.out.printf("mês %d => %s\n",i,nome);
		}
	}
}
