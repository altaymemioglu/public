package com.hotel.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.data.Room;

@RepositoryRestResource
public interface RoomRepository extends JpaRepository<Room, Long>{
	
	@Cacheable("rooms")
	Room findByNumber(@Param("number")int number);
	Room findByFloor(@Param("floor")int floor);
	Room findByCapacity(@Param("capacity")String capacity);
}
