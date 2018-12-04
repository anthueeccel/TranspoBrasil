package br.com.cursojava.produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.cursojava.produtos.Produto;

public class RepositorioProduto {

	private static List<Produto> lista = new ArrayList<>();
	private static Integer count = 1;
	static {
		lista.add(new Produto(count++, "Copo", "Copo alto vidro fino", 25.80));
		lista.add(new Produto(count++, "Prato", "Prato porcelana branco", 26.40));
		lista.add(new Produto(count++, "Leiteira", "Branca 400ml", 145.50));
		lista.add(new Produto(count++, "Travessa Grande", "Oval - branca 50cm", 89.50));
		lista.add(new Produto(count++, "Travessa Pequena", "Oval - branca 25cm", 45.60));
		lista.add(new Produto(count++, "Jogo talher A", "3 peças inox", 77.30));
		lista.add(new Produto(count++, "Guardanapo", "tecido branco 30x30cm", 9.90));
	}

	public List<Produto> buscarTodos() {
		return lista;
	}

	public Produto buscarPorId(Integer id) {
		Produto produto = null;
		for (Produto atual : lista) {
			if (atual != null && id.equals(atual.getId())) {
				produto = atual;
				break;
			}
		}
		return produto;
	}

	public boolean salvar(Produto produto) {
		boolean resultado = false;
		if (produto != null) {
			if (produto.getId() == null) {
				resultado = inserir(produto);
			} else {
				resultado = atualizar(produto);
			}
		}
		return resultado;
	}

	private boolean atualizar(Produto produto) {
		boolean resultado = false;
		int idx = lista.indexOf(produto);
		if (idx > -1) {
			lista.set(idx, produto);
			resultado = true;
		}
		return resultado;
	}

	private boolean inserir(Produto produto) {
		produto.setId(count++);
		return lista.add(produto);
	}

	public boolean remover(Integer id) {
		int qt = lista.size();
		lista = lista.stream().filter(c -> !id.equals(c.getId())).collect(Collectors.toList());
		return qt > lista.size();
	}
}
