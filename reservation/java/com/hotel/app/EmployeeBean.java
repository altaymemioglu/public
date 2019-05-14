package com.hotel.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

	public Employee[] getEmployee(Long... id){
		List<Employee> employees = new ArrayList<Employee>();
		if(id!=null && id.length>0)
			employeeRepository.findAllById(Arrays.asList(id)).forEach(e->employees.add(e));
		else
			employeeRepository.findAll().forEach(e->employees.add(e));
	    return employees.toArray(new Employee[employees.size()]);
	}
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee remove(Employee employee) {
		employeeRepository.delete(employee);
		return employee;
	}

	public Activity getEmployeeActivity(Employee employee) {
		Activity activity = new Activity();
		 
		activity.setCheckIns(
				Arrays 
		        .stream(checkInBean.getCheckIn(employee)) 
		        .collect(Collectors.toSet())
				);
		activity.setCheckOuts(
				Arrays 
		        .stream(checkOutBean.getCheckOut(employee)) 
		        .collect(Collectors.toSet())
				);
				
		return activity;
	}
	
}
