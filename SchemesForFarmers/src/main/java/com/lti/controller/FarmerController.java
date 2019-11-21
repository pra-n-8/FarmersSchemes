
package com.lti.controller;
  
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;  

@Controller  
public class FarmerController {  
	
	  @RequestMapping(value="/register.lti")
    public String display(@RequestParam("name") String name,@RequestParam("no")int no)  
    {  
	System.out.println(name);
        return "home.jsp";  
    }     

}  