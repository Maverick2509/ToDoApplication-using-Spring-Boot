package com.ToDo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Welcome {
	
	@Value("${welcome.message}")
	private String welcomeMessage;
	
	public String getWelcomeMethod() {
		
		return welcomeMessage;
	}
	

}
