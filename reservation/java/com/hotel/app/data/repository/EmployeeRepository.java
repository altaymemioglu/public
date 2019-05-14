package com.hotel.app.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.data.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
