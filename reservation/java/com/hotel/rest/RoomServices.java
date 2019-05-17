package com.hotel.rest;

import java.util.Calendar;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.RoomBean;
import com.hotel.app.data.Customer;
import com.hotel.app.data.Room;

@Component
@Path("/services/room")//localhost:8080/reservation/rest/services/room
public class RoomServices {
	
	RoomBean roomBean = ApplicationContextReference.context.getBean(RoomBean.class);

	@GET
	@Path("/createroom")
	@Produces(MediaType.APPLICATION_JSON)
	public Room createRoom(@QueryParam("floor") int floor, @QueryParam("number") int number,
			@QueryParam("capacity") int capacity, @QueryParam("attribute") String attribute) {		
		return roomBean.createRoom(floor,number,capacity,attribute);
	}
	
	@POST
	@Path("/reservate")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Room[] reservate(Room[] rooms) {
		roomBean.reservate(rooms, new Customer(),new java.sql.Date(Calendar.getInstance().getTime().getTime()),new java.sql.Date(Calendar.getInstance().getTime().getTime()));
		return rooms;
	}
	
}
