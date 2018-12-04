package br.com.cursojava.contatos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioContato {
	
	private static List<Contato>lista = new ArrayList<>();
	private static Integer count = 1;
	static{
		lista.add(new Contato(count++, "Fred", "frederico@teste.com", "123456789"));
		lista.add(new Contato(count++, "Maria", "m@teste.com", "789456123"));
		lista.add(new Contato(count++, "José", "jose@teste.com", "369258147"));
		lista.add(new Contato(count++, "Adão", "paraiso@teste.com", "147258369"));
		lista.add(new Contato(count++, "Tibúrcio", "tibinho@teste.com", "258369147"));
		lista.add(new Contato(count++, "Lucy", "lu@teste.com", "789456123"));
		lista.add(new Contato(count++, "Eldésio", "eld@teste.com", "159267348"));
	}
	
	public List<Contato> buscarTodos(){
		return lista;
	}
	
	public Contato buscarPorId(Integer id){
		Contato contato = null;
		for (Contato atual : lista) {
			if(atual != null && id.equals(atual.getId())){
				contato = atual;
				break;
			}
		}
		return contato;
	}
	
	public boolean salvar(Contato contato){
		boolean resultado = false;
		if(contato != null){
			if(contato.getId() == null){
				resultado = inserir(contato);
			}else{
				resultado = atualizar(contato);
			}
		}
		return resultado;
	}

	private boolean atualizar(Contato contato) {
		boolean resultado = false;
		int idx = lista.indexOf(contato);
		if(idx > -1){
			lista.set(idx, contato);
			resultado = true;
		}
		return resultado;
	}

	private boolean inserir(Contato contato) {
		contato.setId(count++);
		return lista.add(contato);
	}
	
	public boolean remover(Integer id){
		int qt = lista.size();
		lista=lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
		return qt > lista.size();
	}
}
