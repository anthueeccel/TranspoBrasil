package br.com.cursojava;


import java.util.List;

public class pessoaDAOtest {

public static void main(String[] args) {
	PessoaDAO dao = new PessoaDAO();
	List<Pessoa> listaPessoas = dao.buscarTodos();for(
	Pessoa pessoa:listaPessoas)
	{
		System.out.println(pessoa);
	}

	for(int i = 1;i<=10;i++)
	{
		System.out.println(dao.buscarPorId(i));
	}

//	Adicionar pessoa	
//	Pessoa tib = new Pessoa(null, "Tiburcio");
//	dao.inserir(tib);
//	System.out.println(tib);
	
	Pessoa pessoa = dao.buscarPorId(9);
	System.out.println(pessoa);
	pessoa.setNome("Tiburcio da Silva");
	dao.atualizar(pessoa);
	System.out.println(dao.buscarPorId(9));
	
	dao.remover(9);
	System.out.println(dao.buscarPorId(9));
	
	
	
	
}
	
	
}
