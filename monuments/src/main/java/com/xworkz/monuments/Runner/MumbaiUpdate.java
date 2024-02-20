package com.xworkz.monuments.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;


public class MumbaiUpdate {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query=entityManager.createQuery("UPDATE MonumentsEntity entity SET entity.name=:nameby WHERE entity.city=:cityby");
		query.setParameter("nameby", "GateWay Of India");
		query.setParameter("cityby", "Mumbai");
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

