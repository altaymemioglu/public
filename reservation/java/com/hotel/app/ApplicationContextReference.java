package com.hotel.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hotel.config.AppConfig;

public class ApplicationContextReference {
	public static ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
}
