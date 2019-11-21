package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.lti.dao.InputDao;
import com.lti.interfaces.FarmerServiceInterface;
import com.lti.interfaces.GenericInterface;
import com.lti.model.Farmer;


@Service
public class FarmerService implements FarmerServiceInterface { 
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
	GenericInterface dao = (GenericInterface)ctx.getBean("genericdao");

//	public void display(Farmer farmer)
//	{
//		Inputdao.retrieve(Id, clazz)(farmer);
//	}

	public void addNewFarmer(Farmer farmer) {
		dao.addEntity(farmer);
		
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

	public void loginCheck() {
		// TODO Auto-generated method stub
		
	}
	
	}
