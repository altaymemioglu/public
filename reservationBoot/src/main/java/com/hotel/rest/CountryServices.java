package com.hotel.rest;

import java.util.List;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.CountryBean;
import com.hotel.data.Country;

@RestController
public class CountryServices {
	
	@Autowired
	CountryBean countryBean;
	
	@GetMapping(path = "/services/country/save", produces = "application/json")
	public Country createRoom(@QueryParam("name") String name, @QueryParam("nativeName") String nativeName,
			@QueryParam("continent") String continent, @QueryParam("capital") String capital,
			@QueryParam("cities") String cities) {		
		String[] cityArray = cities.split(",");
		return countryBean.save(name, nativeName, continent, capital, cityArray);
	}
	

	@GetMapping(path = "/services/country/findAll", produces = "application/json")
	public List<Country> findAll() {
		return countryBean.find();
	}
	
	@GetMapping(path = "/services/country/findByCriteria", produces = "application/json")
	public List<Country> findByCriteria(@QueryParam("key") String key,@QueryParam("value") String value) {	
		return countryBean.findByCriteria(key,value);
	}
}
