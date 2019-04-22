package com.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotel.app.Reception;

@Configuration
public class SpringAppConfig {
	
	@Bean 
	public Reception reception(){
		return new Reception();
	}
}