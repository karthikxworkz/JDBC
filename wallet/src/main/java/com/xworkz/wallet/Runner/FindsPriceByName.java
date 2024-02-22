package com.xworkz.wallet.Runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.wallet.Entity.WalletEntity;

public class FindsPriceByName {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findpricebyname");
			query.setParameter("nameby", "Fold Wallet");
			Object obj = query.getSingleResult();
			WalletEntity walletEntity = (WalletEntity) obj;
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
