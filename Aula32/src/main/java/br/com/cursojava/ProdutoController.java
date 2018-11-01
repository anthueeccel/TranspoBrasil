package br.com.cursojava;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

	private ProdutoDAO dao = new ProdutoDAO();
	private Produto produto = new Produto();

	public String adicionarProduto(String nome, Double preco) {		
		String ok = "n";
		produto.setNome(nome);
		produto.setPreco(preco);
		if(dao.inserir(produto)) {
			ok = "y";
		}		
		return ok;
	}

	public boolean isNomeValido(String nome) {
		boolean valido = nome != null && !"".equals(nome.trim()) && nome.length() >= 3;
		return valido;
	}

	public boolean isPrecoValido(Double preco) {
		boolean valido = preco != null && preco >= 0.01;
		return valido;
	}

	public List<Produto> buscarTodos() {
		return dao.buscarTodos();
	}

	public List<Produto> filtrarPorNome(String nome) {
		List<Produto> lista = dao.buscarPorNome(nome);
		return lista;
	}

	public List<Produto> filtrarPorFaixaPreco(Double minimo, Double maximo) {
		return dao.buscarPorPreco(minimo, maximo);
	}

	public int removerProduto(Integer id) {
		dao.remover(id);
//		retorna id = 1 excluído ou id = 0 não excluído
		return id;
	}

	public void editarProduto(Produto produto) {
		dao.atualizar(produto);

	}

	public Produto buscarPorId(Integer id) {
		return dao.buscarPorId(id);
	}

	public int contar(int quantidade) {
		return dao.contar(quantidade);
	}

}
