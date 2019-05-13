package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
