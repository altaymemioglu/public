package com.hotel.app.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.Session;

@Entity
@Table(name = "room")
public class Room implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "number")
	private int number;

	@Column(name = "floor")
	private int floor;
	
	@Transient
	private boolean checked;

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

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public static Room create(Session session,int floor,int number) {
		Room room = new Room();
		room.setFloor(floor);
		room.setNumber(number);

		session.beginTransaction();
		session.save(room);
		session.getTransaction().commit();
		
		return room;
	}
	
	@Override
	public String toString() {
		return "Room [id=" + id + ",floor=" + floor + ", number=" + number + "]";
	}
}