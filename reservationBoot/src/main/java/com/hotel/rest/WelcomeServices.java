package com.hotel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.WelcomeBean;
import com.hotel.app.data.Message;

@RestController
public class WelcomeServices {
	
	@Autowired
	WelcomeBean welcomeBean;
	
	@GetMapping(path = "/services/welcome", produces = "application/json")
	public Message getWelcomeMessage() {
		return welcomeBean.getMessage();
	}
	
}
