package com.xworkz.occupation.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.occupation.Entity.OccupationEntity;

public class Catering {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {

			entityTransaction.begin();
			OccupationEntity occupationEntity = new OccupationEntity();
			occupationEntity.setId(5);
			occupationEntity.setName("Catering");
			occupationEntity.setTypes(2);
			occupationEntity.setBranch("Event Management");
			entityManager.persist(occupationEntity);
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
