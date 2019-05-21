package com.hotel.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.hotel.config.JerseyConfig;
import com.hotel.config.PersistenceJPAConfig;

@SpringBootApplication
@Import({JerseyConfig.class,PersistenceJPAConfig.class})
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
