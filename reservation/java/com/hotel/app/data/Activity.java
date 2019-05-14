package com.hotel.app.data;

import java.io.Serializable;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Activity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Set<CheckIn> checkIns;
	private Set<CheckOut> checkOuts;
	private Set<Reservation> reservations;
}
