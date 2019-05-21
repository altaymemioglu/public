package com.hotel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.data.Message;

@Component
@Path("/services/welcome")//localhost:8080/reservationBoot/rest/services/welcome
public class WelcomeServices {
	
	@GET
	@Path("/getWelcomeMessage")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getWelcomeMessage() {
		Message msg = new Message();
		msg.setText("Hello World!");
		return msg;
	}

}
