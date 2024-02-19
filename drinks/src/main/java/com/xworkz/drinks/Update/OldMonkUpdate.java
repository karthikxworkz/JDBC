package com.xworkz.drinks.Update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.Entity.DrinksEntity;

public class OldMonkUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			DrinksEntity drinksEntity=entityManager.find(DrinksEntity.class, 2);
			drinksEntity.setName("Blenders Pride");
			entityManager.merge(drinksEntity);
			entityTransaction.rollback();
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
