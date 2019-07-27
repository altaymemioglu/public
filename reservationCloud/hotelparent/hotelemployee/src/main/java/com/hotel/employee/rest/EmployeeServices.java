package com.hotel.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.employee.bean.EmployeeBean;
import com.hotel.employee.data.Employee;

@RestController
@RequestMapping(value = "/services", produces = "application/hal+json", consumes = "application/json") 
public class EmployeeServices {
	
	@Autowired
	EmployeeBean employeeBean;
	
	@PostMapping("/save")
	public Employee save(Employee employee) {
		return employeeBean.saveEmployee(employee);
	}
	
	@PostMapping("/remove")
	public Employee remove(Employee employee) {
		return employeeBean.remove(employee);
	}
}
