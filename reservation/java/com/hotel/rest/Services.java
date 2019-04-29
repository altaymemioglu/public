package com.hotel.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hotel.app.Reception;
import com.hotel.app.data.Customer;
import com.hotel.app.data.Message;
import com.hotel.app.data.Room;
import com.hotel.config.SpringAppConfig;

@Path("/services")
public class Services {
	private ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringAppConfig.class);

	@GET
	@Path("/welcome")//localhost:8080/reservation/rest/services/welcome
	@Produces(MediaType.APPLICATION_JSON)
	public Message getWelcomeMessage() {
		Reception reception = ctx.getBean(Reception.class);
		return reception.getMessage();
	}

	@GET
	@Path("/createroom") //localhost:8080/reservation/rest/services/createroom?floor=1&number=4
	@Produces(MediaType.APPLICATION_JSON)
	public Room createRoom(@QueryParam("floor") int floor, @QueryParam("number") int number,
			@QueryParam("capacity") int capacity, @QueryParam("attribute") String attribute) {
		Reception reception = ctx.getBean(Reception.class);
		Room newRoom = reception.createRoom(floor,number,capacity,attribute);
		return newRoom;
	}
	
	@GET
	@Path("/getallrooms") //http://localhost:8080/reservation/rest/services/getallrooms
	@Produces(MediaType.APPLICATION_JSON)
	public List<Room> getAllRooms() {
		Reception reception = ctx.getBean(Reception.class);
		List<Room> rooms = reception.getRoom();
		return rooms;
	}
	
	@GET
	@Path("/getallcustomers") //http://localhost:8080/reservation/rest/services/getallcustomers
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getAllCustomers() {
		Reception reception = ctx.getBean(Reception.class);
		List<Customer> customers = reception.getCustomer();
		return customers;
	}
}
