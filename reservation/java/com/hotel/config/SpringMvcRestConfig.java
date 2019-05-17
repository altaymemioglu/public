package com.hotel.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.core.mapping.RepositoryDetectionStrategy;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;

import com.hotel.app.data.Activity;
import com.hotel.app.data.Adress;
import com.hotel.app.data.CheckIn;
import com.hotel.app.data.CheckOut;
import com.hotel.app.data.Customer;
import com.hotel.app.data.Employee;
import com.hotel.app.data.Message;
import com.hotel.app.data.Reservation;
import com.hotel.app.data.Role;
import com.hotel.app.data.Room;
import com.hotel.app.data.Stay;
import com.hotel.app.data.User;

@Configuration
public class SpringMvcRestConfig extends RepositoryRestMvcConfiguration {

	public SpringMvcRestConfig(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
		super(context, conversionService);
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		super.configureContentNegotiation(configurer);
		configurer.defaultContentType(MediaType.APPLICATION_JSON);
	}

	@Bean
	public RepositoryRestConfigurer repositoryRestConfigurer() {
		return new RepositoryRestConfigurer() {
			@Override
			public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
				config.exposeIdsFor(Activity.class);
				config.exposeIdsFor(Adress.class);
				config.exposeIdsFor(CheckIn.class);
				config.exposeIdsFor(CheckOut.class);
				config.exposeIdsFor(Customer.class);
				config.exposeIdsFor(Employee.class);
				config.exposeIdsFor(Message.class);
				config.exposeIdsFor(Reservation.class);
				config.exposeIdsFor(Role.class);
				config.exposeIdsFor(Room.class);
				config.exposeIdsFor(Stay.class);
				config.exposeIdsFor(User.class);
			
				config.setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.ANNOTATED);
			}
		};
	}
}
