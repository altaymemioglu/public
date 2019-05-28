package com.hotel.employee.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.hotel.security.repository","com.hotel.employee.repository"})
@EnableJpaAuditing
public class JpaConfig{
	
	@Autowired
	private JpaConfigProperties jpaConfigProperties;
	
	@Autowired
	private DataSource dataSource;
 
	@Autowired
	private EntityManagerFactory entityManagerFactory;
 
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean entityManager = new LocalContainerEntityManagerFactoryBean();
		entityManager.setDataSource(this.dataSource);
		entityManager.setPackagesToScan(new String[] { "com.hotel.security.data","com.hotel.employee.data"}); 
		entityManager.setJpaVendorAdapter(jpaVendorAdapter());
		entityManager.setJpaProperties(additionalProperties()); 
		return entityManager;
	}
   
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		return new HibernateJpaVendorAdapter();
	}
    
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(jpaConfigProperties.getDriverclassname());
		dataSource.setUrl(jpaConfigProperties.getDatasource_url());
       	dataSource.setUsername(jpaConfigProperties.getDatasource_username());
       	dataSource.setPassword(jpaConfigProperties.getDatasource_password());
       	return dataSource;
	}
   
	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(this.entityManagerFactory);    
		return transactionManager;
	}
    
	@Bean
   	public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
		return new PersistenceExceptionTranslationPostProcessor();
	}
    
	final Properties additionalProperties() {
		Properties settings = new Properties();
		settings.put(Environment.DIALECT, jpaConfigProperties.getDialect());
		settings.put(Environment.SHOW_SQL, jpaConfigProperties.getShowsql());
		settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, jpaConfigProperties.getCurrent_session_context_class());
		settings.put(Environment.HBM2DDL_AUTO, jpaConfigProperties.getHbm2ddl_auto());
		settings.put("hibernate.jdbc.lob.non_contextual_creation", jpaConfigProperties.getLob_non_contextual_creation());
		return settings;
	}
}