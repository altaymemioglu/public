package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Room;

public interface RoomRepository extends JpaRepository<Room, Long>{

}
