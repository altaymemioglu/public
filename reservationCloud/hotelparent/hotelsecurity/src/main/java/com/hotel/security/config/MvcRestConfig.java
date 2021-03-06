package com.hotel.security.config;

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

import com.hotel.security.data.Role;
import com.hotel.security.data.User;

@Configuration
public class MvcRestConfig extends RepositoryRestMvcConfiguration {

	public MvcRestConfig(ApplicationContext context, ObjectFactory<ConversionService> conversionService) {
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
				config.exposeIdsFor(User.class);
				config.exposeIdsFor(Role.class);
			
				config.setRepositoryDetectionStrategy(RepositoryDetectionStrategy.RepositoryDetectionStrategies.ANNOTATED);
			}
		};
	}
}
