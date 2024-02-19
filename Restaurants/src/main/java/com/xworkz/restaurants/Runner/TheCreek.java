package com.xworkz.restaurants.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.restaurants.Entity.RestaurantsEntity;

public class TheCreek {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		try {
			entityTransaction.begin();
			RestaurantsEntity restaurantsEntity=new RestaurantsEntity();
			restaurantsEntity.setId(5);
			restaurantsEntity.setName("The Creek");
			restaurantsEntity.setLocation("Whitefield ITPL Main Road,Bengaluru");
			restaurantsEntity.setRatings(4.5f);
			entityManager.persist(restaurantsEntity);
			entityTransaction.commit();
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
