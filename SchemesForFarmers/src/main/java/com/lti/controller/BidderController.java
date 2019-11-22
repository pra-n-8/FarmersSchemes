package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.model.Bidder;

@Controller
public class BidderController {
	
	 @RequestMapping(value="/Bregister.lti")
	    public String display(Bidder bidder)  
	    {  
		System.out.println(bidder.getBidderName());
	        return "home.jsp";  
	    }
	

}
