package com.hotel.app;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.Activity;
import com.hotel.app.data.Employee;
import com.hotel.app.data.repository.EmployeeRepository;

@Component
@Transactional
public class EmployeeBean {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	CheckInBean checkInBean;
	
	@Autowired
	CheckOutBean checkOutBean;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee remove(Employee employee) {
		employeeRepository.delete(employee);
		return employee;
	}

	public Activity getEmployeeActivity(long employeeId) {
		Activity activity = new Activity();
		
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		 
		if(employee.isPresent()) {
			activity.setCheckIns(
					Arrays 
			        .stream(checkInBean.getCheckIn(employee.get())) 
			        .collect(Collectors.toSet())
					);
			activity.setCheckOuts(
					Arrays 
			        .stream(checkOutBean.getCheckOut(employee.get())) 
			        .collect(Collectors.toSet())
					);
		}
				
		return activity;
	}
	
}
