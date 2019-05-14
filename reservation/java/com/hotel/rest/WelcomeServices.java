package com.hotel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.WelcomeBean;
import com.hotel.app.data.Message;

@Component
@Path("/services/welcome")//localhost:8080/reservation/rest/services/welcome
public class WelcomeServices {
	
	@GET
	@Path("/welcome")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getWelcomeMessage() {
		WelcomeBean welcome = ApplicationContextReference.context.getBean(WelcomeBean.class);
		return welcome.getMessage();
	}
	
}
