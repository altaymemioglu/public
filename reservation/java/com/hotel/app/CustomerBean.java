package com.hotel.app;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.repository.CustomerRepository;

@Component
@Transactional
public class CustomerBean {
	
	@Autowired
	CustomerRepository customerRepository;

}
