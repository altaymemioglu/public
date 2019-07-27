package com.hotel.web.starter;

import org.apache.catalina.Context;
import org.apache.tomcat.util.scan.StandardJarScanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import com.hotel.security.config.SecurityConfig;
import com.hotel.web.config.JpaConfig;

@SpringBootApplication
@EnableEurekaClient
@Import({JpaConfig.class,SecurityConfig.class})
@ComponentScan(basePackages = "com.hotel.web")
public class WebMicroservice {

	public static void main(String[] args) {
        SpringApplication.run(WebMicroservice.class, args);
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
