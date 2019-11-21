package com.lti.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.interfaces.GenericInterface;
import com.lti.model.CropDetails;
import com.lti.model.ListedCrops;

@Component("genericDao")
public class InputDao implements GenericInterface {
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void addEntity(Object entity) {
//		em.merge(entity);
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConnection");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et = em.getTransaction();
//		et.begin();
		em.merge(entity);
//		et.commit();
//		em.close();
//		emf.close();
	}
//
	public Object retrieve(int Id, Class clazz) {
	Object obj=(Object)em.find(clazz,Id);

	return obj;

	}

	public List<ListedCrops> fetchByExpiryDate(LocalDateTime dateAndTime)
	{
		Query q=em.createQuery("select c from ListedCrops c where c.expiryTime < :dt");

		q.setParameter("dt", dateAndTime);
		List <ListedCrops> crops=q.getResultList();
		return crops;
	}
	
	
//	List<String> list1=q.list();
	
//	List<String> list1= new ArrayList<String>();
//	  list.add(q);

	public List<CropDetails> fetchCropDetails(CropDetails crop)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConnection");
		EntityManager em = emf.createEntityManager();
		Query q1=em.createQuery("SELECT CROPID, CROPNAME,CROPTYPE,RATE FROM CropDetails c where c.farmerid=:cd");
		q1.setParameter("cd", crop);
		List <CropDetails>crops=q1.getResultList();
		em.close();
		emf.close(); 
		return crops;
	}

}
