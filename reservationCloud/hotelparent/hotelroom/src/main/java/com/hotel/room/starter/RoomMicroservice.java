package com.hotel.room.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hotel.room.config.JpaConfig;
import com.hotel.room.config.MvcRestConfig;
import com.hotel.security.config.SecurityConfig;

@SpringBootApplication
@EnableEurekaClient
@Import({JpaConfig.class,MvcRestConfig.class,SecurityConfig.class})
@ComponentScan(basePackages = "com.hotel.room")
public class RoomMicroservice {

	public static void main(String[] args) {
        SpringApplication.run(RoomMicroservice.class, args);
    }
}
