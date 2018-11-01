package br.com.cursojava.lambda;

public class ExemploLambda {

	public static void main(String[] args) {

		Voador v1 = new Aviao();

		Voador v2 = () -> {
			System.out.println("Voador Lambda1 voando...");
		};
		Voador v3 = () -> System.out.println("Voador Lambda2 voando...");

		liberarVoo(v1);
		liberarVoo(v2);
		liberarVoo(v3);
		liberarVoo(() -> System.out.println("Voador Lambda3 voando..."));

		Voador v = new Voador() {
			public void voar() {
				System.out.println("Faz alguma coisa");
			}
		};

//		 Lambda. Se tiver apenas uma linha n�o necessita as {}
//		 Voador v1 = () -> System.out.println("Faz alguma coisa");
		Voador vl = () -> {
			System.out.println("Faz alguma coisa");
		};
	}

	private static void liberarVoo(Voador voador) {
		voador.voar();
	}
}
