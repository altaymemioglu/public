package com.hotel.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.hotel.app.ApplicationContextReference;
import com.hotel.app.CountryBean;
import com.hotel.app.data.Country;

@Component
@Path("/services/country")//localhost:8080/reservation/rest/services/country
public class CountryServices {
	
	CountryBean countryBean = ApplicationContextReference.context.getBean(CountryBean.class);

	@GET
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public Country createRoom(@QueryParam("name") String name, @QueryParam("nativeName") String nativeName,
			@QueryParam("continent") String continent, @QueryParam("capital") String capital,
			@QueryParam("cities") String cities) {		
		String[] cityArray = cities.split(",");
		return countryBean.save(name, nativeName, continent, capital, cityArray);
	}
	
	@GET
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> findAll() {		
		return countryBean.find();
	}
	
	@GET
	@Path("/findByCriteria")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Country> findByCriteria(@QueryParam("key") String key,@QueryParam("value") String value) {		
		return countryBean.findByCriteria(key,value);
	}
}
