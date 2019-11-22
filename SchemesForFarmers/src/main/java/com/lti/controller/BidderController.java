package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.model.Bidder;

@Controller
public class BidderController {
	

	//@Autowired
 // private	BidderService bidderService
	
	 @RequestMapping(value="/Bregister.lti")
	    public String display(Bidder bidder)  
	    {  
		System.out.println(bidder);
	        return "home.jsp";  
	    }
	

}
