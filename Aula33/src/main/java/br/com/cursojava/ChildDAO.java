package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ChildDAO {
		
	public boolean inserir(Child child) {
		boolean resultado = false;
		if (child != null && child.getId() == null) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(child);
			em.getTransaction().commit();
			em.close();
			resultado = child.getId() != null;
		}
		return resultado;
	}

	public boolean atualizar(Child child) {
		boolean resultado = false;
		if (child != null && child.getId() != null) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(child);
				em.getTransaction().commit();
				em.close();
				resultado = true;
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}			
		}
		return resultado;
	}
	
	public List<Child> buscarTodos() {

		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Child> query = em.createQuery("from Child", Child.class);
		List<Child> lista = query.getResultList();
		em.close();
				
		return lista;
	}
	
	public Child buscarPorId(Integer id) {
	EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
	TypedQuery<Child> query = em.createQuery("from Child c where c.id = " + id, Child.class);
	Child child = query.getSingleResult();
	em.close();
	return child;
	
}

	
	public int remover(int id) {
		int resultado = 0;
		if (id >= 0) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				Child child = em.find(Child.class, id);
				em.remove(child);
				em.getTransaction().commit();
				em.close();
				resultado = 1;
			} catch (Exception e) {
				if (em != null && em.isOpen()) {
					em.getTransaction().rollback();
				}
			}			
		}
		return resultado;
	}




}
