package com.hotel.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import com.sun.jersey.spi.container.servlet.ServletContainer;

public class WebAppInitializer implements WebApplicationInitializer {
	public void onStartup(ServletContext ctx) throws ServletException {
		
		AnnotationConfigWebApplicationContext webCtx = new AnnotationConfigWebApplicationContext();
		webCtx.register(WebConfig.class);
		webCtx.register(MvcRestConfig.class);
		webCtx.setServletContext(ctx);
		
		ServletRegistration.Dynamic springdispatcherServlet = ctx.addServlet("dispatcher", new DispatcherServlet(webCtx));
		springdispatcherServlet.setLoadOnStartup(1);
		springdispatcherServlet.addMapping("/");
		
		ServletRegistration.Dynamic jerseyDispatcherServlet = ctx.addServlet("jersey-serlvet", new ServletContainer());
		jerseyDispatcherServlet.setLoadOnStartup(1);
		jerseyDispatcherServlet.setInitParameter("com.sun.jersey.config.property.packages", "com.hotel.rest");
		jerseyDispatcherServlet.setInitParameter("com.sun.jersey.api.json.POJOMappingFeature", "true");
		jerseyDispatcherServlet.addMapping("/rest/*");	
		
		ctx.addFilter("springSecurityFilterChain", new DelegatingFilterProxy("springSecurityFilterChain"))
        .addMappingForUrlPatterns(null, false, "/*");
	}
}
