package com.hotel.employee.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.data.Activity;
import com.hotel.data.Employee;
import com.hotel.employee.repository.EmployeeRepository;

@Component
@Transactional
public class EmployeeBean {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee remove(Employee employee) {
		employeeRepository.delete(employee);
		return employee;
	}

	public Activity getEmployeeActivity(long employeeid) {
		// TODO Auto-generated method stub
		return null;
	}

}
