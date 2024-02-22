package com.xworkz.supercars.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.supercars.Entity.SupercarsEntity;

public class FindPriceByName {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findpricebyname");
			query.setParameter("nameby", "Fold Wallet");
			Object obj = query.getSingleResult();
			SupercarsEntity supercarsEntity = (SupercarsEntity) obj;
			int price = (int) obj;
			System.out.println("This is class:"+price);
			entityTransaction.commit();
		} catch (PersistenceException e) {
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		} finally {
			entityManagerFactory.close();
			entityManager.close();
		}
	}
}
