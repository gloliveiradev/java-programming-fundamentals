package br.computacao.aulajpa.main;

import javax.persistence.EntityManager;

import br.computacao.aulajpa.dao.JpaUtil;

/**
 * Defines the class App for this project.
 */
public class App {

	public static void main(String[] args) {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.close();

	}

}
