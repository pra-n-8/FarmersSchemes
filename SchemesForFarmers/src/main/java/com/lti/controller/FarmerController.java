
package com.lti.controller;
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.model.Farmer;  

@Controller  
public class FarmerController {  
	
	  @RequestMapping(value="/register")
    public String display(Farmer farmer)  
    {  
	System.out.println(farmer);
        return "home.jsp";  
    }     
}  
