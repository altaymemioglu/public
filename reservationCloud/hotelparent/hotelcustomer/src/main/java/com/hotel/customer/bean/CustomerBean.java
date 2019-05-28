package com.hotel.customer.bean;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.customer.data.Customer;
import com.hotel.customer.repository.CustomerRepository;

@Component
@Transactional
public class CustomerBean {
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer remove(Customer customer) {
		customerRepository.delete(customer);
		return customer;
	}

}
