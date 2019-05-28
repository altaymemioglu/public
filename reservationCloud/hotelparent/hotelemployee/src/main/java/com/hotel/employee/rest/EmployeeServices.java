package com.hotel.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.employee.bean.EmployeeBean;
import com.hotel.employee.data.Employee;

@RestController
public class EmployeeServices {
	
	@Autowired
	EmployeeBean employeeBean;
	
	@PostMapping(path = "/services/employee/save", produces = "application/json",consumes = "application/json")
	public Employee saveEmployee(Employee employee) {
		return employeeBean.saveEmployee(employee);
	}
	
	@PostMapping(path = "/services/employee/remove", produces = "application/json",consumes = "application/json")
	public Employee removeEmployee(Employee employee) {
		return employeeBean.remove(employee);
	}
}
