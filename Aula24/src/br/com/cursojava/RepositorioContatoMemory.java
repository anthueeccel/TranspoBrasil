package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RepositorioContatoMemory implements RepositorioContato {

	private List<Contato> contatos = new ArrayList<Contato>();
	private static int count = 1;
	Stream<Contato> streamContatos = contatos.stream();

	public boolean incluir(Contato contato) {
		boolean resultado = false;
		if (contato != null) {
			contato.setId(count++);
			resultado = contatos.add(contato);
			}
		return resultado;
	}
	
	public boolean editar(Contato contato) {
		boolean resultado = false;
	Optional<Contato> data = contatos.stream().filter((c)-> c.getId().equals(contato.getId())).findFirst();
	if(data.isPresent()) {
		Contato atualiza = data.get();
		atualiza.setNome(contato.getNome());
		atualiza.setEmail(contato.getEmail());
		atualiza.setTelefone(contato.getTelefone());
		atualiza.setTipo(contato.getTipo());
		resultado = true;
	}
	return resultado;
	}
	
	public List<Contato> buscarTodos() {
		return contatos;
	}

	

	public List<Contato> buscarPorNome(String nome) {

		List<Contato> buscarPorNome = contatos.stream().filter(p -> nome != null && p.getNome().equals(nome))
				.collect(Collectors.toList());
		return buscarPorNome;
	}

	public List<Contato> buscarPorTelefone(String telefone) {

		List<Contato> buscarPorTelefone = contatos.stream().filter(p -> p.getTelefone().equals(telefone))
				.collect(Collectors.toList());

		return contatos;
	}

	public List<Contato> buscarPorTipo(TipoContato tipo) {

		List<Contato> buscarPorTipo = contatos.stream().filter(p -> p.getTipo().equals(tipo))
				.collect(Collectors.toList());

		return contatos;
	}



	public boolean remover(Contato contato) {
		boolean resultado = false;		
		Optional<Contato> filtrado = contatos.stream().filter((c)-> c.getNome().equals(contato.getNome())).findFirst();
		if(filtrado.isPresent()) {
		resultado = contatos.remove(filtrado.get());
		}
		return resultado;
	}

	@Override
	public Contato buscarPorId(Integer id) {
		List<Contato> contatoId = contatos.stream().filter(p -> p.getId().equals(id)).collect(Collectors.toList());
		return contatoId.get(0);
		}

}
