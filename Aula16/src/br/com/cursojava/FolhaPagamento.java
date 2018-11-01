package br.com.cursojava;

public class FolhaPagamento {

	public void imprimirFolha(Funcionario funcionario) {		
		System.out.println(funcionario.getClass().getSimpleName());
		System.out.printf("Código: %s\n", funcionario.getCodigo());
		System.out.printf("Nome: %s\n", funcionario.getNome());
		System.out.printf("Salário Base: %.2f\n", funcionario.getSalarioBase());
		System.out.printf("Salário Líquido: %.2f\n", funcionario.salarioLiquido());
		System.out.println("= = = = = = = = = = = = = = = = ");
	}

}
