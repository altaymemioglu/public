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
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "room")
@Getter
@Setter
public class Room extends ResourceSupport implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Positive
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long roomId;

	@Positive
	@Column(name = "number")
	private int number;

	@Column(name = "floor")
	private int floor;
	
	@PositiveOrZero
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
