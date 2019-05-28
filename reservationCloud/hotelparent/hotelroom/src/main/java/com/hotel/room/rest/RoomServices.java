package com.hotel.room.rest;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.room.bean.ReservationBean;
import com.hotel.room.bean.RoomBean;
import com.hotel.room.data.Reservation;
import com.hotel.room.data.Room;

@RestController
@RequestMapping(value = "/services/room", produces = "application/hal+json", consumes = "application/json") 
public class RoomServices {
	
	@Autowired
	RoomBean roomBean;
	
	@Autowired
	ReservationBean reservationBean;
	
	@PostMapping("/save")
	public Room save(Room room) {
		return roomBean.save(room);
	}
	
	@PostMapping("/remove")
	public Room remove(Room room) {
		return roomBean.remove(room);
	}
	
	@GetMapping("/reservate")
	public Reservation reservate(@QueryParam("roomid") int roomid,@QueryParam("customerid") int customerid,
			@QueryParam("startdate") String startDate,@QueryParam("enddate") String endDate) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		Date start = new java.sql.Date(df.parse(startDate).getTime());
		Date end = new java.sql.Date(df.parse(endDate).getTime());
		return reservationBean.save(Reservation.create(roomid, customerid, start, end));
	}
}
