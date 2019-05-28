package com.hotel.employee.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.employee.data.Employee;
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

}
