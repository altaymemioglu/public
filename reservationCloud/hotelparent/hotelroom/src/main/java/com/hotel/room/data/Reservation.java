package com.hotel.room.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "reservation")
@Getter
@Setter
public class Reservation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Positive
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Positive
	@Column(name = "customerid")
	private long customerId;
	
	@Positive
	@Column(name = "roomid")
	private long roomId;
	
	@NotNull
	@Column(name = "startdate")
	private Date startDate;
	
	@NotNull
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
