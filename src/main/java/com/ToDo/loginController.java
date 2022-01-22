package com.ToDo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class loginController {
	
	@Autowired
	private loginService loginservice;
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginMethod(ModelMap model)
	{
		return "login.jsp";
	}
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginCredentials(@RequestParam String name, @RequestParam String password, ModelMap model)
	{
		
		if(loginservice.match(name, password)) {
			model.put("name", name);
			return "welcome.jsp";
		}
		
		else
		{
			model.put("error_message", "INVALID CREDENTIALS");
			return "login.jsp";
		}
	}

}
