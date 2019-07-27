package com.hotel.system;

import org.apache.tomcat.util.scan.StandardJarScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hotel.config.JpaConfig;
import com.hotel.config.SecurityConfig;

import org.apache.catalina.Context;

@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = "com.hotel")
@Import({JpaConfig.class,SecurityConfig.class})
public class HotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}
	
	@Bean
	public TomcatServletWebServerFactory tomcatFactory() {
	   return new TomcatServletWebServerFactory() {
	      @Override
	      protected void postProcessContext(Context context) {
	         ((StandardJarScanner) context.getJarScanner()).setScanManifest(false);
	   }};
	}
}
