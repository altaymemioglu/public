package com.hotel.app.data;

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
import javax.persistence.Transient;

import org.hibernate.envers.Audited;

import lombok.Getter;
import lombok.Setter;

@Audited
@Entity
@Table(name = "room")
@Getter
@Setter
public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Transient
	private boolean isChecked;

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
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public boolean isIsChecked() {
		return isChecked;
	}

	public void setIsChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public static Room create(int floor,int number,int capacity,String attribute) {
		Room room = new Room();
		room.setFloor(floor);
		room.setNumber(number);
		room.setCapacity(capacity);
		room.setAttribute(attribute);
		return room;
	}
	
	@Override
	public String toString() {
		return "Room [id=" + id + ",floor=" + floor + ", number=" + number + ", capacity=" + capacity + ", attribute=" + attribute + "]";
	}
}
