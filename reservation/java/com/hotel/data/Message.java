package com.hotel.data;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {
	private String text;
	
	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
}
