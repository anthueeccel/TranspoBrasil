package br.com.cursojava;

import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

public class TarefaTeste {
	
	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityFactory().createEntityManager();
		em.getTransaction().begin();
		
//		Tarefa tarefa = new Tarefa();
//		tarefa.setTitulo("Minha primeira tarefa)");
//		tarefa.setStatus(StatusTarefa.NOVA);
//		tarefa.setCriadoEm(new Date());
//		tarefa.setAtualizadoEm(new Date());
//		em.persist(tarefa);
		
		Tarefa t1 = new Tarefa(null, "tarefa do Bozo",StatusTarefa.NOVA, new Date(), new Date());
		Usuario u = new Usuario(null, "Bozo Gerentão", "bozo@teste.com", Arrays.asList(t1));
		t1.setUsuario(u);		
//		Set<PerfilUsuario> perfis = new HashSet<>();
//		perfis.add(PerfilUsuario.BAGRINHO);
//		perfis.add(PerfilUsuario.MANAGER);
//		perfis.add(PerfilUsuario.ADMIN);
//		u.setPerfis(perfis);
		em.persist(u);
		em.getTransaction().commit();
		
		em.close();
		JPAUtil.shutdown();
	}
	

}
