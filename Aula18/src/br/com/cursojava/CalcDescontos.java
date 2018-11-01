package br.com.cursojava;

public class CalcDescontos {

	private double desconto;

	public double calculo(double valor) {
				
		if (valor > 0 && valor <= 1800) {			
			return valor;
		} else if (valor > 1800 && valor <= 2400) {
			desconto = 5;
		} else if (valor > 2400 && valor <= 3599.99) {
			desconto = 22;
		} else if (valor >= 3600) {
			desconto = 32;
		} else {
			return 0;
		}		
		return (valor - (valor * (desconto/100)));
	} 

}
