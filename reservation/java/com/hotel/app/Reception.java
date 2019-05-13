package com.hotel.app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.hotel.app.data.Customer;
import com.hotel.app.data.Message;
import com.hotel.app.data.Reservation;
import com.hotel.app.data.Room;

@Component
@Transactional
public class Reception {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Message getMessage() {
		Message message = new Message();
		message.setText("Welcome to our Hotel!");
		return message;
	}

	public Room createRoom(int floor,int number,int capacity,String attribute) {
		Room newRoom = Room.create(floor, number,capacity,attribute);
		entityManager.persist(newRoom);
		return newRoom;
	}
	
	public Room[] getRoom(Integer... id){
	    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Room> query = builder.createQuery(Room.class);
	    Root<Room> variableRoot = query.from(Room.class);
	    query.select(variableRoot);
	    List<Room> rooms = entityManager.createQuery(query).getResultList();
	    return rooms.toArray(new Room[rooms.size()]);
	}
	
	public Customer[] getCustomer(Integer... id){
	    CriteriaBuilder builder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Customer> query = builder.createQuery(Customer.class);
	    Root<Customer> variableRoot = query.from(Customer.class);
	    query.select(variableRoot);
	    List<Customer> customers = entityManager.createQuery(query).getResultList();
	    return customers.toArray(new Customer[customers.size()]);
	}

	public Reservation[] reservate(Room[] rooms,Customer customer,Date start,Date end) {
		
		List<Reservation> reservations = new ArrayList<Reservation>();
		for (Room room : rooms) {
			if(room.isIsChecked()) {
				Reservation reservation = Reservation.create(customer,room,start,end);
				entityManager.persist(reservation);
				reservations.add(reservation);
			}
		}
		return reservations.toArray(new Reservation[reservations.size()]);
	}
}
