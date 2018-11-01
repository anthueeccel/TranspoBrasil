package br.com.cursojava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ExemploStreamFilter {

	public static void main(String[] args) {

		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1, "Produto alimento 01 A", 10.0, Categoria.ALIMENTO));
		produtos.add(new Produto(2, "Produto eletônico 02 A", 100.0, Categoria.ELETRONICO));
		produtos.add(new Produto(3, "Produto limpeza 03 A", 90.0, Categoria.LIMPEZA));
		produtos.add(new Produto(4, "Produto perfumaria 04 A", 47.90, Categoria.PERFUMARIA));
		produtos.add(new Produto(5, "Produto vestuário 05 A", 29.51, Categoria.VESTUARIO));
		produtos.add(new Produto(6, "Produto alimento 06 B", 19.90, Categoria.ALIMENTO));
		produtos.add(new Produto(7, "Produto eletrônico 07 B", 10.0, Categoria.ELETRONICO));
		produtos.add(new Produto(8, "Produto limpeza 08 B", 10.0, Categoria.LIMPEZA));
		produtos.add(new Produto(9, "Produto perfumaria 09 B", 1.0, Categoria.PERFUMARIA));
		produtos.add(new Produto(10, "Produto vestuário 10 B", 89.90, Categoria.VESTUARIO));

		Stream<Produto> streamProdutos = produtos.stream();

//		Stream<Produto> alimentos = streamProdutos.filter((Produto produto)->{
//			return Categoria.ALIMENTO.equals(produto.getCategoria());
//		});
//		
//		alimentos.forEach(p->System.out.println(p.getNome()));
//		alimentos.forEach(p->(System.out::println));

		streamProdutos.filter((Produto produto) -> {
			return Categoria.PERFUMARIA.equals(produto.getCategoria());
		}).map(p -> p.getNome()) // .map retorna String de strings
//		.forEach(p->System.out.println(p));
				.forEach(System.out::println); // como.map retorna String, pode imprimir no console.

//		 criar e adicionar oa produtos filtrados em uma nova lista.
		List<Produto> alimentos = produtos.stream().filter((Produto produto) -> {
			return Categoria.PERFUMARIA.equals(produto.getCategoria());
		}).collect(Collectors.toList());
		for (Produto alimento : alimentos) {
			System.out.println(alimento.getNome());
		}

		Stream<Produto> streamProdutos2 = produtos.stream();
		streamProdutos2.filter((Produto produto) -> {
			return Categoria.ALIMENTO.equals(produto.getCategoria());
		}).map(p -> p.getNome()).forEach(System.out::println);


		List<Produto> menoresQue50 = produtos
				.stream().filter((Produto produto) -> {
					return produto.getPreco() <= 50;
				})
				.collect(Collectors.toList());
		System.out.println("Produtos R$ < R$50.0");
		for (Produto prod : menoresQue50) {
			System.out.println(prod.getPreco() + " - " + prod.getNome());
		}
		
		
		List<String> nomesProdutosMaiorQue50 = produtos
				.stream()
				.filter(p -> p.getPreco() > 50)
				.map(p -> p.getNome())
				.collect(Collectors.toList());

		for (String nomesProdutos : nomesProdutosMaiorQue50) {
			System.out.println(nomesProdutos);
		}
		
		
		double total = produtos.stream().mapToDouble(p -> p.getPreco()).sum();
		System.out.printf("\nO valor total da soma dos produtos é %.2f\n", total);
		OptionalDouble media = produtos.stream().mapToDouble(p -> p.getPreco()).average();
		System.out.printf("\nA média de preços é %.2f\n", media.getAsDouble());
		
		Map<Categoria, Double> map = new HashMap<>();
		Map<Categoria, Double> totalizador = produtos
				.stream()
				.filter(p -> p.getPreco() < 50) // somente os produtos com valor menor que 50.
				.reduce(map, (current, prod) -> {
					Double value = current.get(prod.getCategoria());
					if(value == null) {
						value = 0.0;
						}
					value += prod.getPreco();					
					current.put(prod.getCategoria(), value);
							
					return current;
				}, (i,j) -> {
					return i;
				});
		for (Map.Entry<Categoria, Double> item: totalizador.entrySet()) {
			System.out.printf("\n%s = %.2f\n", item.getKey(), item.getValue());
		}
		
		//menor preço
		Optional<Produto> produtoMenor = produtos
		.stream()
		.reduce((anterior, atual) -> {
			return anterior.getPreco() < atual.getPreco() ? anterior : atual;
		});
		System.out.println("\nProduto de menor valor é " + produtoMenor.get().getNome() + " e custa " + produtoMenor.get().getPreco());
		
	}

}
