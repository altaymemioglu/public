package com.hotel.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.envers.Audited;

import lombok.Getter;
import lombok.Setter;

@Audited
@Entity
@Table(name = "stay")
@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stay implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "checkinid")
	private long checkinid;
	
	@Column(name = "checkoutid")
	private long checkoutid;
	
	@Column(name = "payment")
	private long payment;

}
