package com.xworkz.seasons.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class SpringUpdate {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createQuery("UPDATE SeasonsEntity entity SET entity.occur=:occurby WHERE entity.charactersistics=:charactersisticsby");
		query.setParameter("occurby", "June to August");
		query.setParameter("charactersisticsby", "cold temp");
			query.executeUpdate();
			
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
