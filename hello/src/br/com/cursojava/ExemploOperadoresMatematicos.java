package br.com.cursojava;

public class ExemploOperadoresMatematicos {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 3;
		System.out.println("Somar + ");
		System.out.printf("%d + %d = %d\n", numero1, numero2, numero1 + numero2);
		System.out.println("Subtrair - ");
		System.out.printf("%d - %d = %d\n", numero1, numero2, numero1 - numero2);
		System.out.println("Multiplicar - ");
		System.out.printf("%d * %d = %d\n", numero1, numero2, numero1 * numero2);
		System.out.println("Dividir / ");
		System.out.printf("%d / %d = %d\n", numero1, numero2, numero1 / numero2);
		System.out.println("Dividir - ");
		System.out.printf("%d / %d.2f = %f\n", numero1, 3.0, numero1 / 3.0);
		System.out.println("Resto % ");
		System.out.printf("%d %% %d = %d\n", numero1, numero2, numero1 % numero2);
	}

}
