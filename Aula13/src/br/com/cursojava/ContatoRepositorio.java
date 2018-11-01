package br.com.cursojava;

public class ContatoRepositorio {
	
	private static int count = 1;

	private Contato[] contatos = new Contato[10];
	private int quantidade = 0;

	public boolean inserirContato(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			if (quantidade < contatos.length) {
				contato.setId(count++);
				contatos[quantidade++] = contato;
				resultado = true;
			}
		}
		return resultado;
	}

	public Contato[] buscarTodos() {
		Contato[] resultado = new Contato[quantidade];
		for (int index = 0; index < quantidade; index++) {
			resultado[index] = contatos[index];			
		}
		return resultado;
	}
}
