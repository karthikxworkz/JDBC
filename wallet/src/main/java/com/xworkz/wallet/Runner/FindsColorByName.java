package com.xworkz.wallet.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.wallet.Entity.WalletEntity;

public class FindsColorByName {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findcolorbyname");
			query.setParameter("nameby", "Fold Wallet");
			Object obj = query.getSingleResult();
			WalletEntity walletEntity = (WalletEntity) obj;
			String color = (String) obj;
			
			entityTransaction.commit();
			System.out.println("This is class:" + color);
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
