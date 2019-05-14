package com.hotel.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.CustomerBean;
import com.hotel.app.data.Customer;

@Component
@Path("/services/customer")//localhost:8080/reservation/rest/services/customer
public class CustomerServices {
	
	CustomerBean customerBean = ApplicationContextReference.context.getBean(CustomerBean.class);

	@GET
	@Path("/getallcustomers")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer[] getAllCustomers() {
		return customerBean.getCustomer();
	}
	
}
