package com.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.hotel.app.CheckInBean;
import com.hotel.app.CheckOutBean;
import com.hotel.app.CountryBean;
import com.hotel.app.CustomerBean;
import com.hotel.app.EmployeeBean;
import com.hotel.app.RoomBean;
import com.hotel.app.UserBean;
import com.hotel.app.WelcomeBean;

@Configuration
@Import({JpaConfig.class,SecurityConfig.class,MongoConfig.class,CacheConfig.class})
public class AppConfig {
	
	@Bean 
	public WelcomeBean welcomeBean(){
		return new WelcomeBean();
	}
	
	@Bean 
	public CheckInBean checkInBean(){
		return new CheckInBean();
	}
	
	@Bean 
	public CheckOutBean checkOutBean(){
		return new CheckOutBean();
	}
	
	@Bean 
	public CustomerBean customerBean(){
		return new CustomerBean();
	}
	
	@Bean 
	public EmployeeBean employeeBean(){
		return new EmployeeBean();
	}
	
	@Bean 
	public RoomBean roomBean(){
		return new RoomBean();
	}
	
	@Bean 
	public UserBean userBean(){
		return new UserBean();
	}
	
	@Bean 
	public CountryBean countryBean(){
		return new CountryBean();
	}

}