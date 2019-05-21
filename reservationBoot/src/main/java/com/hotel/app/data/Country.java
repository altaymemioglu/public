package com.hotel.app.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "countries")
@Getter
@Setter
public class Country {

	@Id
	private String id;
	
	private String name;
	private String nativeName;
	private String continent;
	private String capital;
	private String[] cities;
	
}
