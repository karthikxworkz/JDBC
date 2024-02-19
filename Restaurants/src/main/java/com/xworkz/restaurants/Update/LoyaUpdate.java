package com.xworkz.restaurants.Update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.restaurants.Entity.RestaurantsEntity;

public class LoyaUpdate {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			RestaurantsEntity restaurantsEntity=entityManager.find(RestaurantsEntity.class, 2);
			restaurantsEntity.setRatings(5.0f);
			entityManager.merge(restaurantsEntity);
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
