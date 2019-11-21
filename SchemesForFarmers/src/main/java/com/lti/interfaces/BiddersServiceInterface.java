package com.lti.interfaces;

import java.util.List;

import com.lti.model.ListedCrops;

public interface BiddersServiceInterface {
	public void addNewBidder(Object obj);

	public void addBankToBidder(int id);

	public List<ListedCrops> Shop();

	public void checkPostedItems();

	public void loginCheck();
}
