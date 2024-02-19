package com.xworkz.temples.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.temples.Entity.TemplesEntity;

public class ShreeVenkateshwara {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			TemplesEntity templesEntity = new TemplesEntity();
			templesEntity.setId(6);
			templesEntity.setName("Sri Venkateshwara Temple");
			templesEntity.setPlace("Trupathi");
			templesEntity.setDevoteeOf(" Lord Venkateshwara");
			templesEntity.setState("AndhraPradesh");
			entityManager.persist(templesEntity);
			entityTransaction.commit();
		} catch (PersistenceException e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
