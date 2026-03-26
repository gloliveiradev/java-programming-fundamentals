package br.computacao.aulajpa.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Defines the class JpaUtil for this project.
 */
public class JpaUtil {
	private static final String PERSISTENCE_UNIT_NAME = "pu";
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
