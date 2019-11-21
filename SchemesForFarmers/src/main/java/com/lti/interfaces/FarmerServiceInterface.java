package com.lti.interfaces;

import com.lti.model.Farmer;

public interface FarmerServiceInterface {
	public void addNewFarmer(Farmer obj);

	public void addBankToFarmer(int id);

	public void postCrop();

	public void checkPostedItems();

	public void loginCheck();

}
