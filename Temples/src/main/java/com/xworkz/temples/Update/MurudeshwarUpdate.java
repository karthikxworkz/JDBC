package com.xworkz.temples.Update;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;


import com.xworkz.temples.Entity.TemplesEntity;

public class MurudeshwarUpdate {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			TemplesEntity drinksEntity=entityManager.find(TemplesEntity.class, 2);
			drinksEntity.setDevoteeOf("Shiva");;
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
