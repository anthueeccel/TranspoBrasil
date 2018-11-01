package br.com.cursojava;

public class App {
	
	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.setCodigo("FUNC-001");
		func.setNome("João da Silva");
		func.setSalarioBase(1000);
		
		Vendedor vend = new Vendedor("VEND-001", "Pedro Marcos", 1000);
		vend.setPercentualVenda(0.05);
		vend.setTotalVendas(100000);
		
	
		
		Funcionario fv = new Vendedor();
		fv.setCodigo("VEND-001");
		fv.setNome("Novo Vendedor");
		fv.setSalarioBase(1200);
		if(fv instanceof Vendedor) {
			((Vendedor)fv).setPercentualVenda(0.10);
			((Vendedor)fv).setTotalVendas(20000);
		}
		
		
		FolhaPagamento folha = new FolhaPagamento();
		System.out.println("====== FOLHA DE PAGAMENTO ======");
		folha.imprimirFolha(func);
		folha.imprimirFolha(vend);
		folha.imprimirFolha(fv);
			
	}

}
