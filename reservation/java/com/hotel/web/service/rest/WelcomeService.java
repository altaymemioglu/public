package com.hotel.web.service.rest;

import java.util.Calendar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hotel.config.ApplicationSpringConfiguration;
import com.hotel.reservation.Reception;

@Path("/services")
public class WelcomeService {

	private ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationSpringConfiguration.class);

	@GET
	@Path("/welcome")
	public Response getWelcomeMessage() {
		Reception reception = ctx.getBean(Reception.class);
		return Response.status(200).entity(reception.getMessage()).build();

	}

	@GET
	@Path("/today")
	public Response getDate() {
		return Response.status(200).entity(Calendar.getInstance().getTime().toString()).build();
	}
}
