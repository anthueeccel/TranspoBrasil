package br.com.cursojava.produtos;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

		
	public List<Produto> createProdutos(int i) {
		
		return null;
	}
	
	private static ArrayList<Produto> produtos = new ArrayList<>();
	
	public Produto produto;
	public List<Produto> produtos1 = new ArrayList<>();
	
	
	
	public List<Produto> adicionarProduto(Produto produto) {
	
		produto.add(1, "Leite", "Leite Integral Parmalat", "Alimento", 10);
		produto.add(2, "Pão", "Pão Integral DellaNona", "Alimento", 4);
		produto.add(3, "Queijo", "Queijo Parmesão Tirol", "Alimento", 5);
		produto.add(4, "Alcatra", "Alcatra Maturada Friboi", "Alimento", 3);
		produto.add(5, "Presunto", "PResutno defumando Sadia", "Alimento", 6);
		produto.add(6, "Cerveja", "Cerveja Heinecken 355ml", "Bebida", 24);
		produto.add(7, "Cadeira Praia", "Cadeira de Praia SuperSol - branca", "Bazar", 5);
		produtos.add(produto);
	
	return produtos;
	}


}
