package br.com.cursojava;

import javax.persistence.EntityManager;

public class Testes {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		em.getTransaction().begin();
//		Endereco end = new Endereco(null, "Rua teste 4","1002");
//		Funcionario func = new Funcionario(null, "Funcionario 3", end);
//		em.persist(func);
		Funcionario funcionario = em.find(Funcionario.class, 1);
		System.out.println(funcionario.getId());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getEndereco().getRua());
		em.getTransaction().commit();
		em.close();
		
		JPAUtil.shutdown();
		System.exit(0);
	}

}
