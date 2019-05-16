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
import com.hotel.app.UserBean;
import com.hotel.app.data.User;

@Component
@Path("/services/user")//localhost:8080/reservation/rest/services/user
public class UserServices {
	
	UserBean userBean = ApplicationContextReference.context.getBean(UserBean.class);

	@POST
	@Path("/save")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User save(User user) {
		return userBean.save(user);
	}
	
	@GET
	@Path("/savebasic")
	@Produces(MediaType.APPLICATION_JSON)
	public User createRoom(@QueryParam("username") String username, @QueryParam("password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return userBean.save(user);
	}
	
}
