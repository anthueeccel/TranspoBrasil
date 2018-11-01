package br.com.cursojava;

import java.util.Arrays;

public class ContatoController {
	
	private ContatoRepositorio repositorio = new ContatoRepositorio();
		
	
	public boolean adicionar( String codigo, String nome, String telefone, String email) {		
		boolean resultado = false;		
		if(nome != null && !"".equals(nome.trim()) && nome.length() >= 3
				&& telefone != null && !"".equals(telefone.trim()) 
				&& email != null && !"".equals(email.trim())) {
			Contato contato = new Contato(null, codigo, nome, telefone, email);	
			
//			contato.setNome(nome);
//			contato.setTelefone(telefone);
//			contato.setEmail(email);
			resultado = repositorio.inserirContato(contato);
		} else {
			System.out.println("- Nome deve ter no mínimo 3 letras (sem espaço) \n-Email deve ter no mínimo 3 letras (sem espaço)");
		}
		return resultado;
	}
	
	public Contato getContato(int index) {
		Contato[] contatos = repositorio.buscarTodos();
		Contato resultado = null;
		if(index > -1 && index < contatos.length) {
			resultado = contatos[index];
		}
		return resultado;
	}
	
	public Contato[] listarContatos() { 
		return repositorio.buscarTodos();
	}
	
	public Contato[] filtrarPorNome(String nome) { 
		int quantidade = 0;
		Contato[] todos = repositorio.buscarTodos();
		Contato[] listaPesquisaNome = new Contato[todos.length];		
		for (Contato contato : todos) {
			if(contato != null && contato.getNome() != null && contato.getNome().startsWith(nome)) {
				listaPesquisaNome[quantidade++] = contato;
			}			
			}
		return Arrays.copyOf(listaPesquisaNome, quantidade);
		
	}


}
