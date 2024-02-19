package com.xworkz.occupation.Delete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;


import com.xworkz.occupation.Entity.OccupationEntity;

public class CableTVDelete {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();

			OccupationEntity drinksEntity = entityManager.find(OccupationEntity.class, 3);
			entityManager.remove(drinksEntity);

			entityTransaction.commit();

		} catch (PersistenceException exception) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
