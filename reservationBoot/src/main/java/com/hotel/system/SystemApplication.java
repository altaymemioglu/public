package com.hotel.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hotel.config.PersistenceJPAConfig;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.hotel")
@Import({PersistenceJPAConfig.class})
public class SystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemApplication.class, args);
	}

}
