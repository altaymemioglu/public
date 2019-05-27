package com.hotel.employee.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hotel.employee.config.JpaConfig;
import com.hotel.employee.config.MvcRestConfig;
import com.hotel.security.config.SecurityConfig;

@SpringBootApplication
@EnableEurekaClient
@Import({JpaConfig.class,MvcRestConfig.class,SecurityConfig.class})
@ComponentScan(basePackages = "com.hotel.employee")
public class EmployeeMicroService {

	public static void main(String[] args) {
        SpringApplication.run(EmployeeMicroService.class, args);
    }
}
