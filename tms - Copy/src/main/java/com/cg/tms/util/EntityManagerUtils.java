package com.cg.tms.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerUtils {
	private static EntityManager entityManager;

	
	
	public static EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("oracle");
		if (null==entityManager) {
			 entityManager = entityManagerFactory.createEntityManager();
		}
		else {
			return entityManager;
		}
		return entityManager;
	}
	public static void startTransaction() {
		entityManager.getTransaction().begin();
	}
	public static void stopTransaction() {

		entityManager.getTransaction().commit();
	}

}
