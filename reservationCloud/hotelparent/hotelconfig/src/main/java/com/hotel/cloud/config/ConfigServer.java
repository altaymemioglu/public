package com.hotel.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigServer
@Profile("development")
public class ConfigServer {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServer.class, args);
	}
	
}
