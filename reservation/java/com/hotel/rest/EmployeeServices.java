package com.hotel.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.EmployeeBean;
import com.hotel.data.Activity;
import com.hotel.data.Employee;

@Component
@Path("/services/employee")//localhost:8080/reservation/rest/services/employee
public class EmployeeServices {
	
	EmployeeBean employeeBean = ApplicationContextReference.context.getBean(EmployeeBean.class);
	
	@GET
	@Path("/getemployeeactivities")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Activity getEmployeeActivities(@QueryParam("employeeid") long employeeid) {
		return employeeBean.getEmployeeActivity(employeeid);
	}
	
	@POST
	@Path("/saveemployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee saveEmployee(Employee employee) {
		return employeeBean.saveEmployee(employee);
	}
	
	@POST
	@Path("/removeemployee")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee removeEmployee(Employee employee) {
		return employeeBean.remove(employee);
	}
}
