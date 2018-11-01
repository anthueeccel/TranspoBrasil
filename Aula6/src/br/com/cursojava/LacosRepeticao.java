package br.com.cursojava;

public class LacosRepeticao {
	
	public static void main(String[] args) {
		
		int numero = 10;		
		while(numero <= 20) {
			System.out.print((numero++) + ", ");
		}

		numero = 10;
		while(numero <= 20) {
			if (numero == 15)
				break;
			System.out.print((numero++) + ", ");
		}
		
		numero = 10;
		
		meulabel:
			while(numero < 15) {
				while (numero <= 20) {
			if (numero == 13) {
				break meulabel;
			}
			
			System.out.print((numero++) + ", ");
			}
			}
		
		System.out.println("Fim da Aplicação");
	}
	

	}
	
