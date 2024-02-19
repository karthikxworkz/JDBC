package com.xworkz.temples.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.temples.Entity.TemplesEntity;

public class UdupiSrikrishna {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		try {
			entityTransaction.begin();
			TemplesEntity templesEntity = new TemplesEntity();
			templesEntity.setId(1);
			templesEntity.setName("Udupi SriKrishna");
			templesEntity.setPlace("Udupi");
			templesEntity.setDevoteeOf(" Lord Krishna");
			templesEntity.setState("Karnataka");
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
