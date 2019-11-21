
package com.lti.controller;
  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.model.Farmer;
import com.lti.service.farmerRegistarationPanel;  

@Controller  
public class FarmerController {  
	@Autowired
	farmerRegistarationPanel lp;
	  @RequestMapping(value="/register.lti")
    public String display(Farmer farmer)  
    {  
		
        return "home.jsp";  
    }     

}  