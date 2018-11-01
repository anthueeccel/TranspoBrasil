package br.com.cursojava;

public abstract class Animal {
// classe abstrata n�o pode ser instanciada: Animal animal = new Animal()
	
	public abstract void comer();

	public void respirar() {
		System.out.println(this.getClass().getSimpleName()+" respirando Oxig�nio");
	}

}
