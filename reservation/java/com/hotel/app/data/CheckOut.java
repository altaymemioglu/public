package com.hotel.app.data;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.Getter;
import lombok.Setter;

@Audited
@Entity
@Table(name = "checkout")
@Getter
@Setter
public class CheckOut implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "checkinid")
	private long checkinid;
	
	@Column(name = "employeeid")
	private long employeeid;
	
	@Column(name = "time")
	private Date time;
	
	@Override
	public String toString() {
		return "CheckIn [id=" + id + ", checkinid=" + checkinid + ", employeeid=" + employeeid + ", time=" + time.toString() + "]";
	}
}
