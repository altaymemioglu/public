package com.hotel.rest;

import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.hotel.app.Reception;
import com.hotel.app.data.Customer;
import com.hotel.app.data.Employee;
import com.hotel.app.data.Message;
import com.hotel.app.data.Room;
import com.hotel.config.SpringAppConfig;

@Component
@Path("/services")//localhost:8080/reservation/rest/services
public class Services {
	private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringAppConfig.class);
	
	@GET
	@Path("/welcome")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getWelcomeMessage() {
		Reception reception = applicationContext.getBean(Reception.class);
		return reception.getMessage();
	}
	
	@GET
	@Path("/createroom")
	@Produces(MediaType.APPLICATION_JSON)
	public Room createRoom(@QueryParam("floor") int floor, @QueryParam("number") int number,
			@QueryParam("capacity") int capacity, @QueryParam("attribute") String attribute) {
		Reception reception = applicationContext.getBean(Reception.class);
		Room newRoom = reception.createRoom(floor,number,capacity,attribute);
		return newRoom;
	}
	
	@GET
	@Path("/getallrooms")
	@Produces(MediaType.APPLICATION_JSON)
	public Room[] getAllRooms() {
		Reception reception = applicationContext.getBean(Reception.class);
		return reception.getRoom();
	}
	
	@GET
	@Path("/getallcustomers")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer[] getAllCustomers() {
		Reception reception = applicationContext.getBean(Reception.class);
		return reception.getCustomer();
	}
	
	@GET
	@Path("/getallemployees")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee[] getAllEmployees() {
		Reception reception = applicationContext.getBean(Reception.class);
		return reception.getEmployee();
	}
	
	@POST
	@Path("/reservate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Room[] reservate(Room[] rooms) {
		Reception reception = applicationContext.getBean(Reception.class);
		reception.reservate(rooms, new Customer(),new java.sql.Date(Calendar.getInstance().getTime().getTime()),new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		return rooms;
	}
	
	@POST
	@Path("/saveemployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee saveEmployee(Employee employee) {
		Reception reception = applicationContext.getBean(Reception.class);
		return reception.saveEmployee(employee);
	}
}
