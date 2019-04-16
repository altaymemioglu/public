package com.hotel.web.service.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hotel.config.ApplicationSpringConfiguration;
import com.hotel.reservation.Reception;

@Path("/services")
public class HotelServices {
	private ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationSpringConfiguration.class);

	@GET
	@Path("/welcome")
	public Response getWelcomeMessage() {
		Reception reception = ctx.getBean(Reception.class);
		return Response.status(200).entity(reception.getMessage()).build();

	}

	@GET
	@Path("/createroom")
	public Response createRoom(@QueryParam("floor") int floor, @QueryParam("number") int number) {
		Reception reception = ctx.getBean(Reception.class);
		reception.createRoom(floor,number);
		return Response.status(200).entity("Room created!").build();
	}
}
