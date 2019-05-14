package com.hotel.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hotel.config.SpringAppConfig;

public class ApplicationContextReference {
	public static ApplicationContext context = new AnnotationConfigApplicationContext(SpringAppConfig.class);
}
