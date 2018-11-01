package br.com.cursojava;

import java.util.List;

public interface RepositorioContato {

	public boolean incluir(Contato contato);

	public List<Contato> buscarTodos();

	public boolean editar(Contato contato);

	public List<Contato> buscarPorNome(String nome);

	public List<Contato> buscarPorTelefone(String teleofne);

	public List<Contato> buscarPorTipo(TipoContato tipo);

	public Contato buscarPorId(Integer id);

	public boolean remover(Contato contato);

}
