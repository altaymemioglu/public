package com.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotel.reservation.Reception;

@Configuration
public class ApplicationSpringConfiguration {
	
	@Bean 
	public Reception reception(){
		return new Reception();
	}
}
