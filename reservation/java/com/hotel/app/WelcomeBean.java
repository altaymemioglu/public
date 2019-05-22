package com.hotel.app;

import org.springframework.stereotype.Component;

import com.hotel.data.Message;

@Component
public class WelcomeBean {
	
	public Message getMessage() {
		Message message = new Message();
		message.setText("Welcome to our Hotel!");
		return message;
	}
	
}
