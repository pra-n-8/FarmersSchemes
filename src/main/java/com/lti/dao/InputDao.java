package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;

import com.lti.interfaces.GenericInterface;

//@Component("genericDao")
public class InputDao implements GenericInterface {
//	@PersistenceContext
//	private EntityManager em;
//
//	@Transactional
	public void addEntity(Object entity) {
//		em.merge(entity);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConnection");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.merge(entity);
		et.commit();
		em.close();
		emf.close();
	}
//
	public Object retrieve(int Id, Class clazz) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConnection");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	et.begin();
	Object obj=(Object)em.find(clazz,Id);
	et.commit();
	em.close();
	emf.close(); 
	return obj;
	}
//		Object entity = (Object) em.find(clazz, Id);
//		return entity;
//	}

}
