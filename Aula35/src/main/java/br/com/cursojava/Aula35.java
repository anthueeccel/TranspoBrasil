package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Root;

public class Aula35 {

	public static void main(String[] args) {

		EntityManager em = new JPAUtil().getEntityFactory().createEntityManager();
		em.getTransaction().begin();
//		CriteriaBuilder cb = em.getCriteriaBuilder();

//		-----SELECT ALL -------------------------------------------------------------------------------------------
//		CriteriaQuery<Cidade> cQuery = cb.createQuery(Cidade.class);		
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(c);
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}
//
//		TypedQuery<Cidade> query = em.createQuery("SELECT c FROM Cidade c", Cidade.class);
//		List<Cidade> resultado = query.getResultList();
//		for (Cidade cidades : resultado) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}

//		---- INSERE POPULAÇÃO NA COLUNA POPULACAO - TABELA CIDADE ----------------------------------------------
//		TypedQuery<Cidade> query = em.createQuery("select c from Cidade c",Cidade.class);
//		List<Cidade> cidades = query.getResultList();
//		for (int i = 0; i < cidades.size(); i++) {
//			Cidade cidade = cidades.get(i);
//			cidade.setPopulacao((i+1)* 1000);
//		}
//		em.getTransaction().commit();

//		---- SELECT WHERE ------------------------------------------------------------------------------------
//		
//		TypedQuery<Cidade> query = em.createQuery("SELECT c FROM Cidade c WHERE c.populacao > :pop ", Cidade.class);
//		query.setParameter("pop", 12000);
//		List<Cidade> lista = query.getResultList();
//		for (Cidade cidades : lista) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}
//		em.getTransaction().commit();	
		
//		TypedQuery<Cidade> query = em.createQuery("SELECT c FROM Cidade c WHERE c.populacao < :pop MEMBER OF c.idestado > :idestado", Cidade.class);
//		query.setParameter("pop", 5000);
//		query.setParameter("idestado", 2);
//		List<Cidade> lista = query.getResultList();
//		for (Cidade cidades : lista) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}
//		em.getTransaction().commit();

//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		ParameterExpression<Integer> p = builder.parameter(Integer.class);
//		cQuery.where(builder.equal(cidade.get("nome"), "Blumenau"));
//		// cQuery.orderBy(builder.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. "
//					+ cidades.getPopulacao());
//		}

//		Duas Condições where
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		cQuery.select(cidade);
//		cQuery.where(builder.ge(cidade.get("populacao"), 3000));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> resultado = query.getResultList();
//		for (Cidade cidades : resultado) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() + " Pop. "
//					+ cidades.getPopulacao());
//		}
		
//		CriteriaBuilder builder = em.getCriteriaBuilder();
//		CriteriaQuery<Cidade> cQuery = builder.createQuery(Cidade.class);
//		Root<Cidade> cidade = cQuery.from(Cidade.class);
//		ParameterExpression<Integer> p = builder.parameter(Integer.class);
//		cQuery.select(cidade).where(builder.gt(cidade.get("populacao"),p));
//		cQuery.orderBy(builder.asc(cidade.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		query.setParameter(p,  11000);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome() +" Pop. "+ cidades.getPopulacao());
//		}

//
////		------ Ordenação Ascendente -------------------------------------------------------------------------	
//		CriteriaQuery<Cidade> cQuery = cb.createQuery(Cidade.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(c);
//		cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Cidade> query = em.createQuery(cQuery);
//		List<Cidade> results = query.getResultList();
//		for (Cidade cidades : results) {
//			System.out.println("Cidade: " + cidades.getNome() + " Estado: " + cidades.getEstado().getNome());
//		}
//		
//		
//		
////		Select coluna 1 e 2		
//		CriteriaQuery<Object[]> cQuery = cb.createQuery(Object[].class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.array(c.get("nome"), c.get("populacao")));
//		// cQuery.orderBy(cb.asc(c.get("nome")));
//		TypedQuery<Object[]> query = em.createQuery(cQuery);
//		List<Object[]> results = query.getResultList();
//		for (Object[] cidades : results) {
//			System.out.println("Cidade: " + cidades[0] + " Pop.: " + cidades[1]);
//		}
//
//// 		max		
//		CriteriaQuery<Integer> cQuery = cb.createQuery(Integer.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.max(c.get("populacao")));
//		TypedQuery<Integer> query = em.createQuery(cQuery);
//		Integer results = query.getSingleResult();
//		System.out.println(results);
//
////		min		
//		CriteriaQuery<Integer> cQuery = cb.createQuery(Integer.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.select(cb.min(c.get("populacao")));
//		TypedQuery<Integer> query = em.createQuery(cQuery);
//		Integer results = query.getSingleResult();
//		System.out.println(results);
//
////		count		
//		CriteriaQuery<Long> cQuery = cb.createQuery(Long.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.multiselect(cb.count(c.get("nome")));
//		TypedQuery<Long> query = em.createQuery(cQuery);
//		Long results = query.getSingleResult();
//		System.out.println(results);
//
//// 		avg		
//		CriteriaQuery<Double> cQuery = cb.createQuery(Double.class);
//		Root<Cidade> c = cQuery.from(Cidade.class);
//		cQuery.multiselect(cb.avg(c.get("populacao")));
//		TypedQuery<Double> query = em.createQuery(cQuery);
//		double results = query.getSingleResult();
//		System.out.println(results);

//https://www.objectdb.com/java/jpa/query/jpql/comparison#Criteria_Query_Comparison_

//https://www.objectdb.com/java/jpa/query/criteria

		em.close();
		JPAUtil.shutdown();
	}

}
