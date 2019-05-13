package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
