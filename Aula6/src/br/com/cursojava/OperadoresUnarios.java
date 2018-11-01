package br.com.cursojava;

public class OperadoresUnarios {
	
	public static void main(String[] args) {
		// Operadores unários
		/*
		 * ++
		 * -- 
		 */
		
		//pré-incremento (adiciona +1 antes de apresentar a variável)
		int numero = 10;
		System.out.println(numero);
		System.out.println(++numero); //pré-decremento --numero
		System.out.println(numero);
		// Console: 10  11  11
		
		//pós-incrmento (adiciona +1 após apresentar a variável)
		int numero2 = 20;
		System.out.println(numero2);
		System.out.println(numero2++); //pós-decremento numero2--
		System.out.println(numero2);
		// Console: 20  20  21 
		
		int numeros[] = {1,2,3,4,5};
		int i = 0;
		while(i < numeros.length) {
			System.out.println("numeros[++i]");
		}
		
		
		
	}

}
