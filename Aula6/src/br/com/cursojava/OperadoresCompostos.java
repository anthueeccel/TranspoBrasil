package br.com.cursojava;

public class OperadoresCompostos {
	
	public static void main(String[] args) {
		
		/*
		 * Operadores compostos:
		 *  +=
		 *  -=
		 *  *=
		 *  /=
		 *  %=
		 */
		
		int num = 10;
		int num2 = 5;
		System.out.printf("Numero1 = %d Numero2 = %d \n", num, num2);
		
		
		System.out.println("=== (+-) ========");
		num += num2; // num = num + num2
		System.out.println(num);
		
		System.out.println("=== (-=) ========");
		num -= num2; // num = num - num2
		System.out.println(num);
		
		System.out.println("=== (*=) ========");
		num *= num2; // num = num * num2
		System.out.println(num);
		
		System.out.println("=== (/=) ========");
		num /= num2; // num = num / num2
		System.out.println(num);
		
		System.out.println("=== (%=) ========");
		num %= num2; // num = num % num2
		System.out.println(num);
		
		//Operador composto executa primeiro as opera��es que est�o � direita do operador.
		// n1 *= 2 + 8   ser� o mesmo que n1 = n1 * (2 + 8)
		
		
		
		
	}

}
