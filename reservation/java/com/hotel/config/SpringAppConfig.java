package com.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.hotel.app.Reception;

@Configuration
@Import({PersistenceJPAConfig.class})
public class SpringAppConfig {
	
	@Bean 
	public Reception reception(){
		return new Reception();
	}

}