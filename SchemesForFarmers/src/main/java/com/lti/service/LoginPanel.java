package com.lti.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.interfaces.FarmerServiceInterface;
import com.lti.interfaces.GenericInterface;
import com.lti.model.Farmer;

public class LoginPanel implements FarmerServiceInterface {
ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
GenericInterface dao = (GenericInterface)ctx.getBean("genericdao");
	public void addNew(Object obj) {
		// TODO Auto-generated method stub
		dao.addEntity(obj);
	}

	public void display() {
		// TODO Auto-generated method stub
	}

	public void loginCheck() {
		// TODO Auto-generated method stub
//dao.retrieve(id,Farmer.class);
	}

	public void addNewFarmer(Object obj) {
		// TODO Auto-generated method stub
		
	}

	public void addBankToFarmer(int id) {
		// TODO Auto-generated method stub
		
	}

	public void postCrop() {
		// TODO Auto-generated method stub
		
	}

	public void checkPostedItems() {
		// TODO Auto-generated method stub
		
	}

}
