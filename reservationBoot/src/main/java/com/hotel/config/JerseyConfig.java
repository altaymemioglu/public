package com.hotel.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.hotel.rest.WelcomeServices;

@Configuration
@ApplicationPath("/rest/")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {        
        register(WelcomeServices.class);
    }
}
