package br.com.cursojava;

public class Teste {

	public static int atributoStatic; // vari�vel de classe. N�o precisa de inst�ncia
	public int atributo; // precisa ser instanciado: atributo = new atributo

	public void oi() {
		System.out.println("Oi!!!!");
		System.out.println("O valor do atributo � " + atributo);
		System.out.println("O valor do atributo est�tico � " + atributoStatic);
	}

	public static void hello() {
		System.out.println("Hello!!!");
//		vari�veis de inst�ncia n�o podem ser chamadas diretamente em um m�todo est�tico.
//		System.out.println("O valor do atributo � " + atributo);
		System.out.println("O valor do atributo est�tico � " + atributoStatic);
	}

}
