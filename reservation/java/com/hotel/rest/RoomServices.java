package com.hotel.rest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.RoomBean;
import com.hotel.data.Reservation;
import com.hotel.data.Room;

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
	
	@GET
	@Path("/reservate")
	@Produces(MediaType.APPLICATION_JSON)
	public Reservation reservate(@QueryParam("roomid") int roomid,@QueryParam("customerid") int customerid,
			@QueryParam("startdate") String startDate,@QueryParam("enddate") String endDate) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date start = new java.sql.Date(df.parse(startDate).getTime());
		Date end = new java.sql.Date(df.parse(endDate).getTime());
		return roomBean.reservate(roomid,customerid,start,end);
	}
}
