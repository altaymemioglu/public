package com.hotel.room.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Component;

import com.hotel.room.data.Room;
import com.hotel.room.repository.RoomRepository;

@Component
@Transactional
public class RoomBean {
	
	@Autowired
    RoomRepository roomRepository;
	
	@CacheEvict(value="rooms", allEntries = true)
	public Room save(Room room) {
		return roomRepository.save(room);
	}
	
	public Room remove(Room room) {
		roomRepository.delete(room);
		return room;
	}
}
