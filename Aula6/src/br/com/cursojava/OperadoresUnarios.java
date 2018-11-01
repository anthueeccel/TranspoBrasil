package br.com.cursojava;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		// Operadores un�rios
		/*
		 * ++
		 * -- 
		 */
		
		//pr�-incremento (adiciona +1 antes de apresentar a vari�vel)
		int numero = 10;
		System.out.println(numero);
		System.out.println(++numero); //pr�-decremento --numero
		System.out.println(numero);
		// Console: 10  11  11
		
		//p�s-incrmento (adiciona +1 ap�s apresentar a vari�vel)
		int numero2 = 20;
		System.out.println(numero2);
		System.out.println(numero2++); //p�s-decremento numero2--
		System.out.println(numero2);
		// Console: 20  20  21 
		
		int numeros[] = {1,2,3,4,5};
		int i = 0;
		while(i < numeros.length) {
			System.out.println("numeros[++i]");
		}
		
		
		
	}

}
