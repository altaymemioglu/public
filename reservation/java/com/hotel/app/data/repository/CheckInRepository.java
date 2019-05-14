package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.CheckIn;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {

}
