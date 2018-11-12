package br.com.cursojava.produtos;

import java.util.Arrays;
import java.util.List;

public class Produto {
	
	private Integer produtoId;
	private String produto;
	private String descricao;	
	private String categoria;
	private int quantidade;
	
	
	public Produto() {
		super();	
	}
			
	public Produto(Integer produtoId, String produto, String descricao, String categoria, int quantidade) {
		super();
		this.produtoId = produtoId;
		this.produto = produto;
		this.descricao = descricao;
		this.categoria = categoria;
		this.quantidade = quantidade;
	}

	public Integer getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Integer produtoId) {
		this.produtoId = produtoId;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void add(int i, String string, String string2, String string3, int j) {
			
	}
	
	

}
