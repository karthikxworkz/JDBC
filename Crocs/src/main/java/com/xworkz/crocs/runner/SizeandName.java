package com.xworkz.crocs.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.crocs.Entity.CrocsEntity;

public class SizeandName {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			Query query = entityManager.createNamedQuery("findsbysizeandname");
			query.setParameter("nameby", "crocs");
			query.setParameter("sizeby",8);
			Object obj = query.getSingleResult();
	        CrocsEntity crocsEntity=(CrocsEntity)obj;
			entityTransaction.commit();
		}catch(
		PersistenceException e)
		{
			if (entityTransaction.isActive()) {
				entityTransaction.rollback();
			}
		}finally
		{
			entityManagerFactory.close();
			entityManager.close();
		}
		}
}
