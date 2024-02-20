package com.xworkz.monuments.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

public class OctToNovUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createQuery("UPDATE MonumentsEntity entity SET entity.builtBy=:builtBy WHERE entity.bestTimeToVisit=:bestTimeToVisitby");
			query.setParameter("builtBy", " Mr William Emerson");
			query.setParameter("bestTimeToVisitby","October to November");
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
