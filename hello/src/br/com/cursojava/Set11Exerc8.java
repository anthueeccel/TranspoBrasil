package br.com.cursojava;

// Utilizando a classe Math crie umprograma que escreva o valor absoluto dos n�meros -10, 20, 

public class Set11Exerc8 {
public static void main(String[] args) { 
		
		int a, b, c, d;
		a = -10;
		b = 20;
		c = -50;
		d = -1000;		
		
		int result1 = Math.abs(a);
		int result2 = Math.abs(b);
		int result3 = Math.abs(c);
		int result4 = Math.abs(d);
		
		System.out.printf("Os valores absoluto dos n�meros:\n A) %d � %d,\n B) %d � %d,\n C) %d � %d e\n D) %d � %d", a, result1, b, result2, c, result3, d, result4);
		
	}
	

}
