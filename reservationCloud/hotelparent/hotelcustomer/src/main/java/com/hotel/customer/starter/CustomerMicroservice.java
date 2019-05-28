package com.hotel.customer.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hotel.customer.config.JpaConfig;
import com.hotel.customer.config.MvcRestConfig;
import com.hotel.security.config.SecurityConfig;

@SpringBootApplication
@EnableEurekaClient
@Import({JpaConfig.class,MvcRestConfig.class,SecurityConfig.class})
@ComponentScan(basePackages = "com.hotel.customer")
public class CustomerMicroservice {

	public static void main(String[] args) {
        SpringApplication.run(CustomerMicroservice.class, args);
    }
}
