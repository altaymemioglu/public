package com.hotel.rest;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.UserBean;
import com.hotel.data.User;

@RestController
public class UserServices {
	
	@Autowired
	UserBean userBean;

	@GetMapping(path = "/services/user/save", produces = "application/json", consumes = "application/json")
	public User save(User user) {
		return userBean.save(user);
	}
	
	@GetMapping(path = "/services/user/savebasic", produces = "application/json")
	public User createRoom(@QueryParam("username") String username, @QueryParam("password") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		return userBean.save(user);
	}
	
}
