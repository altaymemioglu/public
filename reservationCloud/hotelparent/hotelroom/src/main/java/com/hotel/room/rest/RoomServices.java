package com.hotel.room.rest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.data.Reservation;
import com.hotel.data.Room;
import com.hotel.room.bean.RoomBean;

@RestController
public class RoomServices {
	
	@Autowired
	RoomBean roomBean;

	@GetMapping(path = "/services/room/save", produces = "application/json")
	public Room createRoom(@QueryParam("floor") int floor, @QueryParam("number") int number,
			@QueryParam("capacity") int capacity, @QueryParam("attribute") String attribute) {		
		return roomBean.createRoom(floor,number,capacity,attribute);
	}
	
	@GetMapping(path = "/services/room/reservate", produces = "application/json")
	public Reservation reservate(@QueryParam("roomid") int roomid,@QueryParam("customerid") int customerid,
			@QueryParam("startdate") String startDate,@QueryParam("enddate") String endDate) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date start = new java.sql.Date(df.parse(startDate).getTime());
		Date end = new java.sql.Date(df.parse(endDate).getTime());
		return roomBean.reservate(roomid,customerid,start,end);
	}
}
