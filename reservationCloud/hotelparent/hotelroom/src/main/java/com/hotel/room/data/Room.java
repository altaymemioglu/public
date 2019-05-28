package com.hotel.room.data;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "number")
	private int number;

	@Column(name = "floor")
	private int floor;
	
	@Column(name = "capacity")
	private int capacity;
	
	@Column(name = "attribute")
	private String attribute;
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL, mappedBy = "roomId", orphanRemoval = true)
	private Set<Reservation> reservations;
	
	public static Room create(int floor,int number,int capacity,String attribute) {
		Room room = new Room();
		room.setFloor(floor);
		room.setNumber(number);
		room.setCapacity(capacity);
		room.setAttribute(attribute);
		return room;
	}
}
