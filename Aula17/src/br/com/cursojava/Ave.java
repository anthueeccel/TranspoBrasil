package br.com.cursojava;

public class Ave extends Animal implements Voador {

	@Override
	public void comer() {
		System.out.println("Ave Comendo...");
		
	}
	
	@Override
	public void voar() {
		System.out.println("Ave voando...");
	}

	
}
