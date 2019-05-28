package com.hotel.room.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.room.data.Reservation;
import com.hotel.room.repository.ReservationRepository;

@Component
@Transactional
public class ReservationBean {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	public Reservation save(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public Reservation remove(Reservation reservation) {
		reservationRepository.delete(reservation);
		return reservation;
	}
	
}
