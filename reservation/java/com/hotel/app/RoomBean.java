package com.hotel.app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.Customer;
import com.hotel.app.data.Reservation;
import com.hotel.app.data.Room;
import com.hotel.app.data.repository.ReservationRepository;
import com.hotel.app.data.repository.RoomRepository;

@Component
@Transactional
public class RoomBean {
	
	@Autowired
    RoomRepository roomRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public Room createRoom(int floor,int number,int capacity,String attribute) {
		Room newRoom = Room.create(floor, number,capacity,attribute);
		return roomRepository.save(newRoom);
	}
	
	public Room[] getRoom(Long... id){
		List<Room> rooms = new ArrayList<Room>();
		if(id!=null && id.length>0)
			roomRepository.findAllById(Arrays.asList(id)).forEach(r->rooms.add(r));
		else
			roomRepository.findAll().forEach(r->rooms.add(r));
	    return rooms.toArray(new Room[rooms.size()]);		
	}
	
	public Reservation[] reservate(Room[] rooms,Customer customer,Date start,Date end) {
		
		List<Reservation> reservations = new ArrayList<Reservation>();
		
		Arrays.asList(rooms)
			.stream()
			.filter(r->r.isIsChecked())
			.forEach(
					room->{
							Reservation reservation = Reservation.create(customer, room, start, end);
							reservations.add(reservationRepository.save(reservation));
						  }
					);
		
		return reservations.toArray(new Reservation[reservations.size()]);
	}
}
