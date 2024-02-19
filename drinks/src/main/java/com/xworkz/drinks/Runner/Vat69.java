package com.xworkz.drinks.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.Entity.DrinksEntity;

public class Vat69 {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		try {
			
			entityTransaction.begin();
			DrinksEntity drinksEntity=new DrinksEntity();
			drinksEntity.setId(7);
			drinksEntity.setName("Vat 69");
			drinksEntity.setPrice(1900);
			drinksEntity.setType("Scotch-Whisky");
			entityManager.persist(drinksEntity);
			entityTransaction.commit();
			
		}catch(PersistenceException e) {
			if(entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

}
