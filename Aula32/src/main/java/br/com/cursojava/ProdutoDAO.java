package br.com.cursojava;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ProdutoDAO {
	
	public List<Produto> buscarTodos() {

		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
		List<Produto> lista = query.getResultList();
		em.close();
				
		return lista;
	}
	
	public List<Produto> buscarPorNome(String nome) {

		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where upper(c.nome) like upper(:nome)", Produto.class);
		//TypedQuery<Produto> query = em.createQuery("from Produto c where c.nome like nome", Produto.class);
		query.setParameter("nome", "%"+nome.toUpperCase()+"%");
		//query.setParameter("nome", "%"+nome+"%");
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	public boolean inserir(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() == null) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			em.getTransaction().begin();
			em.persist(produto);
			em.getTransaction().commit();
			em.close();
			resultado = produto.getId() != null;
		}
		return resultado;
	}

	public boolean atualizar(Produto produto) {
		boolean resultado = false;
		if (produto != null && produto.getId() != null) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				em.merge(produto);
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
	
	
	public int remover(int id) {
		int resultado = 0;
		if (id >= 0) {
			EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
			try {
				em.getTransaction().begin();
				Produto produto = em.find(Produto.class, id);
				em.remove(produto);
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

	public Produto buscarPorId(Integer id) {
		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where c.id = " + id, Produto.class);
		Produto produto = query.getSingleResult();
		em.close();
		return produto;
		
	}

	public List<Produto> buscarPorPreco(Double minimo, Double maximo) {
		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto c where c.preco > " + minimo + " and c.preco < " + maximo, Produto.class);
		List<Produto> lista = query.getResultList();
		em.close();
		return lista;
	}

	public int contar(int quantidade) {
		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		TypedQuery<Produto> query = em.createQuery("from Produto", Produto.class);
		quantidade = query.getResultList().size();
		em.close();
		
		return quantidade;
	}

}
