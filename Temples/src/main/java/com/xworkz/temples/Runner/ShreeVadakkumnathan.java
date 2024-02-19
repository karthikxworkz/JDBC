package com.xworkz.temples.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.temples.Entity.TemplesEntity;

public class ShreeVadakkumnathan {


	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			TemplesEntity templesEntity = new TemplesEntity();
			templesEntity.setId(5);
			templesEntity.setName("Sree Vadakkumnathan Temple");
			templesEntity.setPlace("Thrissur");
			templesEntity.setDevoteeOf(" Lord Shiva");
			templesEntity.setState("Kerala");
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
