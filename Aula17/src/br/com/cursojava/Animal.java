package br.com.cursojava;

public abstract class Animal {
// classe abstrata não pode ser instanciada: Animal animal = new Animal()
	
	public abstract void comer();

	public void respirar() {
		System.out.println(this.getClass().getSimpleName()+" respirando Oxigênio");
	}

}
