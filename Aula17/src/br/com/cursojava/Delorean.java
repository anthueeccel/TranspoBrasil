package br.com.cursojava;

public class Delorean extends Carro implements Turbinavel, Voador{

	@Override
	public void acionarTurbo() {
		System.out.println("Acionando turbo...");
		
	}

	@Override
	public void desligarTurbo() {
		System.out.println("Desligando turbo...");		
	}

	@Override
	public void voar() {
		System.out.println("Delorean Voando...");		
		
	}

}
