package com.hotel.app.data;

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
@Table(name = "checkin")
@Getter
@Setter
public class CheckIn implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "roomid")
	private long roomid;
	
	@Column(name = "customerid")
	private long customerid;
	
	@Column(name = "employeeid")
	private long employeeid;
	
	@Column(name = "time")
	private Date time;
}
