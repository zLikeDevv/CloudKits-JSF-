package br.com.cloudkits.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cludkits");

	EntityManager manager = factory.createEntityManager();

	public EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

}
