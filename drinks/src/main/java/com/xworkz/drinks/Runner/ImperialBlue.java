package com.xworkz.drinks.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import com.xworkz.drinks.Entity.DrinksEntity;

public class ImperialBlue {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		try {
			
			entityTransaction.begin();
			DrinksEntity drinksEntity=new DrinksEntity();
			drinksEntity.setId(9);
			drinksEntity.setName("Imperial Blue");
			drinksEntity.setPrice(640);
			drinksEntity.setType("Whisky");
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


