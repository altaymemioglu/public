package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Stay;

public interface StayRepository extends JpaRepository<Stay, Long> {

}
