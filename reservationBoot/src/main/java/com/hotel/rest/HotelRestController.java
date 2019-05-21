package com.hotel.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.data.Message;

@RestController
public class HotelRestController {

	@GetMapping("/rest/test")
	public Message test() {
		Message msg = new Message();
		msg.setText("Hello World!");
		return msg;
	}
	
}
