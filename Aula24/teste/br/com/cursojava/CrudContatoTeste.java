package br.com.cursojava;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CrudContatoTeste {

	private RepositorioContato ctt;

	@Before
	public void AntesDosTestes() {
		ctt = new RepositorioContatoMemory();
			

	}

	@Test
	public void testIncluirContato() {
		int quantidade = ctt.buscarTodos().size();
		Assert.assertEquals(0,  quantidade);
		
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));
//		ctt.incluir(new Contato(null, "Maria", "maria@teste.com", "33332222", TipoContato.FAMILIA));
//		ctt.incluir(new Contato(null, "Jose", "jose@teste.com", "44332211", TipoContato.OUTROS));
//		ctt.incluir(new Contato(null, "Lucas", "lucas@teste.com", "11221122", TipoContato.TRABALHO));		
		Assert.assertTrue(ctt.buscarTodos().get(0).getId() != null);
		quantidade = ctt.buscarTodos().size();
		Assert.assertEquals(1,  quantidade);
	}
	
	@Test
	public void testEditar() {
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));
		Integer id = ctt.buscarTodos().get(0).getId();
		Contato contato = new Contato(id, "Outro nome", "","", TipoContato.FAMILIA);
		ctt.editar(contato);
		Contato alterado = ctt.buscarTodos().get(0);
		Assert.assertEquals(contato.getId(), alterado.getId());
		Assert.assertEquals(contato.getNome(), alterado.getNome());
		Assert.assertEquals(contato.getEmail(), alterado.getEmail());
		Assert.assertEquals(contato.getTelefone(), alterado.getTelefone());
		Assert.assertEquals(contato.getTipo(), alterado.getTipo());
	}
	
	@Test
	public void testListarPorNome() {
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));
		ctt.incluir(new Contato(null, "Maria", "maria@teste.com", "33332222", TipoContato.FAMILIA));
		ctt.incluir(new Contato(null, "Jose", "jose@teste.com", "44332211", TipoContato.OUTROS));
		ctt.incluir(new Contato(null, "Lucas", "lucas@teste.com", "11221122", TipoContato.TRABALHO));		
		List<Contato> filtrados = ctt.buscarPorNome("João");
		Assert.assertEquals(1, filtrados.size());
	}
	
	@Test
	public void testListarPorTelefone() {
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));	
		ctt.buscarPorTelefone("11223344");
	} 
	
	@Test
	public void testListarPorId() {
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));
		
		Assert.assertEquals(ctt.buscarTodos().get(0), ctt.buscarPorId(1));
	} 
	
	@Test
	public void testListarPorTipo() {
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));	
		ctt.buscarPorTipo(TipoContato.AMIGO);
	} 
	
	@Test
	public void testRemoverContato() {
		int quantidade = ctt.buscarTodos().size();
		Assert.assertEquals(0,  quantidade);		
		ctt.incluir(new Contato(null, "João", "joao@teste.com", "11223344", TipoContato.AMIGO));
		ctt.incluir(new Contato(null, "Maria", "maria@teste.com", "33332222", TipoContato.FAMILIA));
		ctt.incluir(new Contato(null, "Jose", "jose@teste.com", "44332211", TipoContato.OUTROS));
		ctt.incluir(new Contato(null, "Lucas", "lucas@teste.com", "11221122", TipoContato.TRABALHO));		
//		Assert.assertTrue(ctt.buscarTodos().get(0).getId() != null);
		quantidade = ctt.buscarTodos().size();
		Assert.assertEquals(4,  quantidade);
		
		Contato remove = ctt.buscarTodos().get(1);
		ctt.remover(remove);
		quantidade = ctt.buscarTodos().size();
		Assert.assertEquals(3, quantidade);
		
	}

}
