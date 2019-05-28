package com.hotel.security.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("jpa.config")
public class JpaConfigProperties {
	private String driverclassname;
	private String datasource_url;
	private String datasource_username;
	private String datasource_password;

	private String dialect;
	private String showsql;
	private String current_session_context_class;
	private String hbm2ddl_auto;
	private String lob_non_contextual_creation;
}