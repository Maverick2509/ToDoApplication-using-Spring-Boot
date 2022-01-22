package com.ToDo;

import org.springframework.stereotype.Component;

@Component
public class loginService {
	
	private String name="Abhishek";
	private String password="Singh";
	
	public boolean match(String name, String password)
	{
		if(name.equals(this.name) && password.equals(this.password))
			return true;
		
		else
			return false;
	}
	
	

}
