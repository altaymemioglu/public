package com.hotel.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.CustomerBean;
import com.hotel.data.Customer;

@RestController
public class CustomerServices {
	
	private final Logger logger = LoggerFactory.getLogger(CustomerServices.class);
	
	@Autowired
	CustomerBean customerBean;

	@GetMapping(path = "/services/customer/save", produces = "application/json",consumes = "application/json")
	public Customer saveEmployee(Customer customer) {
		logger.info("Customer is saved!");
		return customerBean.saveCustomer(customer);
	}
	
	@PostMapping(path = "/services/customer/remove", produces = "application/json",consumes = "application/json")
	public Customer removeEmployee(Customer customer) {
		return customerBean.remove(customer);
	}
}
