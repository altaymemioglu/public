package com.hotel.rest;

import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.CustomerBean;

@Component
@Path("/services/customer")//localhost:8080/reservation/rest/services/customer
public class CustomerServices {
	
	CustomerBean customerBean = ApplicationContextReference.context.getBean(CustomerBean.class);

}
