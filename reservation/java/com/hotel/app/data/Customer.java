package com.hotel.app.data;

import java.io.Serializable;

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
@Table(name = "customer")
@Getter
@Setter
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "addressid")
	private int addressid;

	@Override
	public String toString() {
		return "Customer [id=" + id + ",name=" + name + ", surname=" + surname + ", addressid=" + addressid + ", phone=" + phone + "]";
	}
	
}
