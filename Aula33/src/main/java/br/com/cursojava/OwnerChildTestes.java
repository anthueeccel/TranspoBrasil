package br.com.cursojava;

import java.util.List;

public class OwnerChildTestes {

	public static void main(String[] args) {

		ChildDAO dao = new ChildDAO();

		Owner owner = new Owner(null, "Dono de 5");
		Child novaChild = new Child(null, "prop.de 5", owner);
		dao.inserir(novaChild);
//		Owner owner = new Owner(2, "Dono de 2");
//		Child child = new Child(2, "Nova Props",owner);		
//		dao.atualizar(new Child(2, "Nova Props",new Owner(2, "Dono de 2")));
		
		List<Child> lista = dao.buscarTodos();
		for (Child child : lista) {
			System.out.println("Child: " + child.getNome() + " Owner: " + child.getId_owner().getNome());			
		}
		System.out.println("Tamanho da lsita: " + lista.size());
		lista.clear();
		
		Child child = dao.buscarPorId(2);
		System.out.println("Id=2 | Child: " + child.getNome() + " Owner: " + child.getId_owner().getNome());
		child.setNome("Filho de 2");
		
		dao.atualizar(child);
		
		Integer resultado = dao.remover(5); 
		System.out.println("1 removido | 2 = não removido. Resultado = " + resultado);
		
		lista = dao.buscarTodos();
		System.out.println("Tamanho da lsita: " + lista.size());
		
		
		
		JPAUtil.shutdown();
		System.exit(0);
	}

}
