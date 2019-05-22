package com.hotel.data;

import java.io.Serializable;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Activity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Set<CheckIn> checkIns;
	private Set<CheckOut> checkOuts;
	private Set<Reservation> reservations;
}
