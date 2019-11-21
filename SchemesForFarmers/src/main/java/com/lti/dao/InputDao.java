package com.lti.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.lti.interfaces.GenericInterface;
import com.lti.model.CropDetails;
import com.lti.model.ListedCrops;

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

	public List<ListedCrops> fetchByExpiryDate(LocalDateTime dateAndTime)
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbConnection");
		EntityManager em = emf.createEntityManager();
		//localdatetime.of(c.EXPIRYTIME,'dd-mm-yy'),'dd-mm-yy') like to_date(to_char( ':et','dd/mm/yy'),'dd-mm-yy');
		Query q=em.createQuery("select c 	from ListedCrops c where c.expiryTime < :dt");

		q.setParameter("dt", dateAndTime);
		List <ListedCrops> crops=q.getResultList();
		em.close();
		emf.close(); 
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
