package com.hotel.customer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.customer.bean.CustomerBean;
import com.hotel.customer.data.Customer;

@RestController
@RequestMapping(value = "/services", produces = "application/hal+json", consumes = "application/json")
public class CustomerServices {
	
	private final Logger logger = LoggerFactory.getLogger(CustomerServices.class);
	
	@Autowired
	CustomerBean customerBean;

	@GetMapping(path = "/save", produces = "application/json",consumes = "application/json")
	public Customer saveEmployee(Customer customer) {
		logger.info("Customer is saved!");
		return customerBean.saveCustomer(customer);
	}
	
	@PostMapping(path = "/remove", produces = "application/json",consumes = "application/json")
	public Customer removeEmployee(Customer customer) {
		return customerBean.remove(customer);
	}
}
