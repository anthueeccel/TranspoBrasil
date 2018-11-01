package br.com.cursojava;
/* Escreva um programa que escreva todos os números primos entre 1 e 50. Considere como número primo o número que
 * é apenas divisivel por 1 e por ele mesmo.
 */

public class Exercicio6 {
	
	public static void main(String[] args) {

		int numero = 1;
		boolean primo = true;
		
		do {
			int divisor = 2;
			primo = true;
			while (divisor <= numero) {
				if (numero % divisor == 0 && divisor != numero) {
					primo = false;
					break;
				}
				divisor++;
			}
			if (primo) {
				System.out.print(numero + ", ");
			}
			numero++;
		} while (numero <= 50);
		System.out.println("");
		System.out.println("-----FIM-----");
		
	}
}
