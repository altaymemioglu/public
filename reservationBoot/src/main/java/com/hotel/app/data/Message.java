package com.hotel.app.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {
	private String text;
	
	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
}
