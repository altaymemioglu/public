package com.hotel.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservation")
@Getter
@Setter
public class Reservation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "customerid")
	private long customerId;
	
	@Column(name = "roomid")
	private long roomId;
	
	@Column(name = "startdate")
	private Date startDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	public static Reservation create(long roomid, long customerid, Date startDate, Date endDate) {
		Reservation reservation = new Reservation();
		reservation.setCustomerId(customerid);
		reservation.setRoomId(roomid);
		reservation.setStartDate(startDate);
		reservation.setEndDate(endDate);
		return reservation;
	}
}
