package com.hotel.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hotel.app.data.Customer;
import com.hotel.app.data.repository.CustomerRepository;

@Component
@Transactional
public class CustomerBean {
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer[] getCustomer(Long... id){
		List<Customer> customers = new ArrayList<Customer>();
		if(id!=null && id.length>0)
			customerRepository.findAllById(Arrays.asList(id)).forEach(c->customers.add(c));
		else
			customerRepository.findAll().forEach(c->customers.add(c));
	    return customers.toArray(new Customer[customers.size()]);
	}
	
}
