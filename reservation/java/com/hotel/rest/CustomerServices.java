package com.hotel.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.CustomerBean;
import com.hotel.data.Customer;

@Component
@Path("/services/customer")//localhost:8080/reservation/rest/services/customer
public class CustomerServices {
	
	private final Logger logger = LoggerFactory.getLogger(CustomerServices.class);
	
	CustomerBean customerBean = ApplicationContextReference.context.getBean(CustomerBean.class);

	@POST
	@Path("/savecustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Customer saveEmployee(Customer customer) {
		logger.info("Customer is saved!");
		return customerBean.saveCustomer(customer);
	}
	
	@POST
	@Path("/removecustomer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Customer removeEmployee(Customer customer) {
		return customerBean.remove(customer);
	}
}
