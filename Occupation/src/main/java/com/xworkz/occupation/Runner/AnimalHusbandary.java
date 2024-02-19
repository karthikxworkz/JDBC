package com.xworkz.occupation.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.occupation.Entity.OccupationEntity;

public class AnimalHusbandary {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			OccupationEntity occupationEntity = new OccupationEntity();
			occupationEntity.setId(1);
			occupationEntity.setName("Animal Husbandary");
			occupationEntity.setTypes(4);
			occupationEntity.setBranch("Agriculture");
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
