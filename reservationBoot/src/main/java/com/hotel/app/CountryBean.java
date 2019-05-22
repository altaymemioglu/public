package com.hotel.app;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.hotel.app.data.Country;

@Component
@Transactional
public class CountryBean {
	
	@Autowired
	MongoOperations mongoOperation;
	
	public Country save(String name,String nativeName,String continent,String capital,String[] cities) {
		Country country = new Country();
		country.setName(name);
		country.setNativeName(nativeName);
		country.setContinent(continent);
		country.setCapital(capital);
		country.setCities(cities);
		mongoOperation.save(country);
		return country;
	}

	public List<Country> find() {
		return mongoOperation.findAll(Country.class);
	}

	public List<Country> findByCriteria(String key,String value) {
		Query query = new Query(Criteria.where(key).is(value));
		return mongoOperation.find(query, Country.class);
	}

}
