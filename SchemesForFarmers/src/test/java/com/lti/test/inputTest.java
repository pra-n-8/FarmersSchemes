package com.lti.test;

import static org.junit.Assert.assertNotNull;

import java.time.LocalDateTime;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.dao.InputDao;
import com.lti.interfaces.GenericInterface;
import com.lti.model.BankDetails;
import com.lti.model.Bidder;
import com.lti.model.CropDetails;
import com.lti.model.Farmer;
import com.lti.model.ListedCrops;

public class inputTest {

	@Test
	public void testBidders() {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");

		GenericInterface dao1 = (GenericInterface) ctx.getBean("genericDao");

		Bidder bidder = new Bidder();
		bidder.setBidderName("vrush");
		bidder.setBidderAddress("virar");
		bidder.setBidderCity("mumbai");
		bidder.setBidderState("maharashtra");
		bidder.setBidderPinCode(401728);
		bidder.setBidderEmail("v@gmail.com");
		bidder.setBidderContact(390293);
		bidder.setBidderPanCard("adfs634");
		bidder.setBidderAadharCard(7834782);
		bidder.setBidderPassword("hczsd");

		dao1.addEntity(bidder);

		Bidder bidder1 = new Bidder();
		bidder1.setBidderName("ram");
		bidder1.setBidderAddress("bandra");
		bidder1.setBidderCity("mumbai");
		bidder1.setBidderState("maharashtra");
		bidder1.setBidderPinCode(401321);
		bidder1.setBidderEmail("r@gmail.com");
		bidder1.setBidderContact(33223);
		bidder1.setBidderPanCard("sad231");
		bidder1.setBidderAadharCard(234435);
		bidder1.setBidderPassword("fdsssv");

		dao1.addEntity(bidder1);

		Bidder bidder2 = new Bidder();
		bidder2.setBidderName("farhan");
		bidder2.setBidderAddress("patna");
		bidder2.setBidderCity("patna");
		bidder2.setBidderState("bihar");
		bidder2.setBidderPinCode(7845);
		bidder2.setBidderEmail("far@gmail.com");
		bidder2.setBidderContact(784512);
		bidder2.setBidderPanCard("hfj8493");
		bidder2.setBidderAadharCard(789451);
		bidder2.setBidderPassword("ffssa");

		dao1.addEntity(bidder2);

		Bidder bidder3 = new Bidder();
		bidder3.setBidderName("vishal");
		bidder3.setBidderAddress(" new delhi");
		bidder3.setBidderCity("new delhi");
		bidder3.setBidderState("delhi");
		bidder3.setBidderPinCode(358292);
		bidder3.setBidderEmail("vish@gmail.com");
		bidder3.setBidderContact(54547);
		bidder3.setBidderPanCard("dfg687");
		bidder3.setBidderAadharCard(789008);
		bidder3.setBidderPassword("hillkb");

		dao1.addEntity(bidder3);

		Bidder bidder4 = new Bidder();
		bidder4.setBidderName("pooja");
		bidder4.setBidderAddress("kalyan");
		bidder4.setBidderCity("kalyan");
		bidder4.setBidderState("maharashtra");
		bidder4.setBidderPinCode(456891);
		bidder4.setBidderEmail("pooja@gmail.com");
		bidder4.setBidderContact(456123);
		bidder4.setBidderPanCard("sdv4532");
		bidder4.setBidderAadharCard(812375);
		bidder4.setBidderPassword("vghjy");

		dao1.addEntity(bidder4);

		Bidder bidder5 = new Bidder();
		bidder5.setBidderName("saurav");
		bidder5.setBidderAddress("nalasopara");
		bidder5.setBidderCity("mumbai");
		bidder5.setBidderState("maharashtra");
		bidder5.setBidderPinCode(978657);
		bidder5.setBidderEmail("sav@gmail.com");
		bidder5.setBidderContact(786453);
		bidder5.setBidderPanCard("bhwd789");
		bidder5.setBidderAadharCard(42456);
		bidder5.setBidderPassword("hczsd");

		dao1.addEntity(bidder5);

	}

	@Test
	public void testFarmer() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface)ctx.getBean("genericdao");
 Farmer farmer1 = new Farmer();
		farmer1.setFarmerName("vaman");
		farmer1.setFarmerAddress("Mumbai");
		farmer1.setFarmerCity("Mumbai");
		farmer1.setFarmerContact(456356);
		farmer1.setFarmerEmail("apoc");
		farmer1.setFarmerPanCard("1895sdgf");
		farmer1.setFarmerPassword("bjc");
		farmer1.setFarmerAadharCard(12347567);
		farmer1.setFarmerState("Maharashtra");
		System.out.println(farmer1);

		// BankDetails B = new BankDetails();
		// B.setBankName("test");
		// B.setFarm(farmer1);
		// farmer1.setBank(B);

		dao.addEntity(farmer1);

		Farmer farmer2 = new Farmer();

		farmer2.setFarmerName("Ramesh");
		farmer2.setFarmerAddress("dahanu");
		farmer2.setFarmerCity("dahanu");
		farmer2.setFarmerContact(78452);
		farmer2.setFarmerEmail("ra@gmail.com");
		farmer2.setFarmerPanCard("hys864");
		farmer2.setFarmerPassword("jbc");
		farmer2.setFarmerAadharCard(78422);
		farmer2.setFarmerState("Maharashtra");

		dao.addEntity(farmer2);

		Farmer farmer3 = new Farmer();

		farmer3.setFarmerName("savita");
		farmer3.setFarmerAddress("palghar");
		farmer3.setFarmerCity("palghar");
		farmer3.setFarmerContact(784231);
		farmer3.setFarmerEmail("saavi@gmail.com");
		farmer3.setFarmerPanCard("oop74859");
		farmer3.setFarmerPassword("lop");
		farmer3.setFarmerAadharCard(451297);
		farmer3.setFarmerState("Maharashtra");

		dao.addEntity(farmer3);

		Farmer farmer4 = new Farmer();

		farmer4.setFarmerName("poonam");
		farmer4.setFarmerAddress("Mumbai");
		farmer4.setFarmerCity("Mumbai");
		farmer4.setFarmerContact(78455);
		farmer4.setFarmerEmail("poo@gmail.com");
		farmer4.setFarmerPanCard("rte3829");
		farmer4.setFarmerPassword("edc");
		farmer4.setFarmerAadharCard(343667);
		farmer4.setFarmerState("Maharashtra");

		dao.addEntity(farmer4);

		Farmer farmer5 = new Farmer();

		farmer5.setFarmerName("sham");
		farmer5.setFarmerAddress("Mumbai");
		farmer5.setFarmerCity("Mumbai");
		farmer5.setFarmerContact(453155);
		farmer5.setFarmerEmail("tgf");
		farmer5.setFarmerPanCard("err4344");
		farmer5.setFarmerPassword("abc");
		farmer5.setFarmerAadharCard(234242);
		farmer5.setFarmerState("Maharashtra");

		dao.addEntity(farmer5);
	}

	@Test
	public void testFetchFarmers() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Farmer farmer = (Farmer) dao.retrieve(10, Farmer.class);
		assertNotNull(farmer);
		System.out.println(farmer.getFarmerName());
		System.out.println(farmer.getFarmerContact());
	}

	@Test
	public void testFetchBidders() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Bidder bidder = (Bidder) dao.retrieve(48, Bidder.class);
		BankDetails bank = new BankDetails();
		bank.setBankName("BOI");
		bidder.setBank(bank);
		dao.addEntity(bidder);
	}

	@Test
	public void testFetchFarmer() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		Farmer farmer = (Farmer) dao.retrieve(10, Farmer.class);
		BankDetails B1 = new BankDetails();
		B1.setBankName("hdfc");
		B1.setFarm(farmer);
		farmer.setBank(B1);
		dao.addEntity(B1);

		// assertNotNull(bidder);
		// System.out.println(bidder.getBidderName());
		// System.out.println(bidder.getBidderContact());

	}

	@Test
	public void testCropDetails() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
//		GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
		InputDao dao = new InputDao();
		Farmer  farmer=(Farmer)dao.retrieve(1, Farmer.class);
		CropDetails  crop=new CropDetails();
		crop.setCropName("wheat");
		crop.setCropType("Food crop");
		crop.setFertilizerType("Organic");
		crop.setRate(500);
		crop.setFarm(farmer);
		dao.addEntity(crop);
		
		CropDetails  crop1=new CropDetails();
		crop1.setCropName("rice");
		crop1.setCropType("Food crop");
		crop1.setFertilizerType("Organic");
		crop1.setRate(400);
		crop1.setFarm(farmer);
		dao.addEntity(crop1);
		
		CropDetails  crop3=new CropDetails();
		crop3.setCropName("sugarcane");
		crop3.setCropType("cash crop");
		crop3.setFertilizerType("Inorganic");
		crop3.setRate(1000);
		crop3.setFarm(farmer);
		dao.addEntity(crop3);
		
		CropDetails  crop4=new CropDetails();
		crop4.setCropName("coffee");
		crop4.setCropType("Plantation  crop");
		crop4.setFertilizerType("Organic");
		crop4.setRate(900);
		crop4.setFarm(farmer);
		dao.addEntity(crop4);
		
		CropDetails  crop5=new CropDetails();
		crop5.setCropName("tea");
		crop5.setCropType("Plantation  crop");
		crop5.setFertilizerType("Organic");
		crop5.setRate(990);
		crop5.setFarm(farmer);
		dao.addEntity(crop5);
		
		CropDetails  crop6=new CropDetails();
		crop6.setCropName("millet");
		crop6.setCropType("Food  crop");
		crop6.setFertilizerType("Organic");
		crop6.setRate(700);
		crop6.setFarm(farmer);
		dao.addEntity(crop6);
		
		
		
		// Query query= EntityManager.createQuery("SELECT f FROM Farmer c JOIN
		// c.CropDetails f", CropDetails.class);
		// Double result = (Double) query1.getSingleResult();
		// System.out.println("Max Employee Salary :" + result);
	}

	// @Test
	// public void testCrop() {
	// ApplicationContext ctx = new
	// ClassPathXmlApplicationContext("app-config.xml");
	// GenericInterface dao = (GenericInterface) ctx.getBean("genericDao");
	// Farmer farmer = dao.retrieve(25);
	// ListedCrops ListedCrops = new ListedCrops();
	// ListedCrops.setFarmer(farmer.getFarmerId());
	// ListedCrops.setCrop(abc);
	// ListedCrops.setBasePrice(100000);
	// ListedCrops.setQuantity(10);
	
	@Test
	public void addListedCrops() {
	 ApplicationContext ctx = new ClassPathXmlApplicationContext("app-config.xml");
	 GenericInterface dao = (GenericInterface)ctx.getBean("genericDao");
		CropDetails crop = (CropDetails)dao.retrieve(25,CropDetails.class);
		
		ListedCrops lc = new ListedCrops();		lc.setCrop(crop);
		lc.setBasePrice(5000);
		lc.setQuantity(600);
		lc.setPostTime(LocalDateTime.now());
		lc.setExpiryTime(LocalDateTime.of(2019,11 , 20,5,30 ));
		Farmer farmer=(Farmer)dao.retrieve(1, Farmer.class);
		lc.setFarmer(farmer);
		dao.addEntity(lc);
	}
}