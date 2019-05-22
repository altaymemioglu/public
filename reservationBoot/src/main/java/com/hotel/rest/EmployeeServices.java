package com.hotel.rest;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.EmployeeBean;
import com.hotel.app.data.Activity;
import com.hotel.app.data.Employee;

@RestController
public class EmployeeServices {
	
	@Autowired
	EmployeeBean employeeBean;
	
	@GetMapping(path = "/services/employee/activities", produces = "application/json")
	public Activity getEmployeeActivities(@QueryParam("employeeid") long employeeid) {
		return employeeBean.getEmployeeActivity(employeeid);
	}
	
	@PostMapping(path = "/services/employee/save", produces = "application/json",consumes = "application/json")
	public Employee saveEmployee(Employee employee) {
		return employeeBean.saveEmployee(employee);
	}
	
	@PostMapping(path = "/services/employee/remove", produces = "application/json",consumes = "application/json")
	public Employee removeEmployee(Employee employee) {
		return employeeBean.remove(employee);
	}
}
