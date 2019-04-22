package com.hotel.app.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "checkin")
public class CheckIn implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "roomid")
	private int roomid;
	
	@Column(name = "customerid")
	private int customerid;
	
	@Column(name = "employeeid")
	private int employeeid;
	
	@Column(name = "time")
	private Date time;
}
