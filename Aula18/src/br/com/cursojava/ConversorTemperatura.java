package br.com.cursojava;
/* Crie um conversor entre graus Celsius e Fahrenheit. O conversor deve ter opções de realizar a conversão entre
 * quaisquer um dos dois tipos de escala. O desenvolvimento deve ser realizado utilizando os conceitos de TDD.
 */

public class ConversorTemperatura {

	private double resultado;
	
	
	
	public double FparaC(double f, double c) {
		resultado = ((f - 32)/1.8); 
				
		return resultado;
	}


	public double CparaF(double f, double c) {
		resultado = ((c * 1.8) + 32);
		return resultado;
	}
	
	

}
