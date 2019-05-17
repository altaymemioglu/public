package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.data.Room;

@RepositoryRestResource
public interface RoomRepository extends JpaRepository<Room, Long>{
	Room findByNumber(@Param("number")int number);
	Room findByFloor(@Param("floor")int floor);
	Room findByCapacity(@Param("capacity")String capacity);
}
