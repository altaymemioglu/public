package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.CheckOut;

public interface CheckOutRepository extends JpaRepository<CheckOut, Long> {

}
