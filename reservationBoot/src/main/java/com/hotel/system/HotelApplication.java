package com.hotel.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hotel.config.JpaConfig;
import com.hotel.config.SecurityConfig;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.hotel")
@Import({JpaConfig.class,SecurityConfig.class})
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

}
