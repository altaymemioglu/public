package com.hotel.security.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hotel.security.config.JpaConfig;
import com.hotel.security.config.MvcRestConfig;
import com.hotel.security.config.SecurityConfig;

@SpringBootApplication
@EnableEurekaClient
@Import({JpaConfig.class,MvcRestConfig.class,SecurityConfig.class})
@ComponentScan(basePackages = "com.hotel.security")
public class SecurityMicroservice {

	public static void main(String[] args) {
        SpringApplication.run(SecurityMicroservice.class, args);
    }
}