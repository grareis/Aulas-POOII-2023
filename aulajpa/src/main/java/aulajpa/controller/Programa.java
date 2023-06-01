package aulajpa.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import aulajpa.entities.Curso;


public class Programa {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Curso c = new Curso(null, "POOII");
		em.persist(c);
		
		em.getTransaction().commit();
		
		Curso c1 = em.find(Curso.class, 1);
		System.out.println(c1);
		
		
		em.getTransaction().commit();
		emf.close();
		em.close();

	}

}
