package br.com.cursojava;

public class Teste {

	public static int atributoStatic; // variável de classe. Não precisa de instância
	public int atributo; // precisa ser instanciado: atributo = new atributo

	public void oi() {
		System.out.println("Oi!!!!");
		System.out.println("O valor do atributo é " + atributo);
		System.out.println("O valor do atributo estático é " + atributoStatic);
	}

	public static void hello() {
		System.out.println("Hello!!!");
//		variáveis de instância não podem ser chamadas diretamente em um método estático.
//		System.out.println("O valor do atributo é " + atributo);
		System.out.println("O valor do atributo estático é " + atributoStatic);
	}

}
