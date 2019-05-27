package com.hotel.room.bean;

import java.sql.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

import com.hotel.room.data.Reservation;
import com.hotel.room.data.Room;
import com.hotel.room.repository.ReservationRepository;
import com.hotel.room.repository.RoomRepository;

@Component
@Transactional
public class RoomBean {
	
	@Autowired
    RoomRepository roomRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@CacheEvict(value="rooms", allEntries = true)
	public Room createRoom(int floor,int number,int capacity,String attribute) {
		Room newRoom = Room.create(floor, number,capacity,attribute);
		return roomRepository.save(newRoom);
	}
	
	public Reservation reservate(long roomid,long customerid,Date start,Date end) {
		return reservationRepository.save(Reservation.create(roomid, customerid, start, end));
	}
}
