package com.hotel.app;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.hotel.app.data.Customer;
import com.hotel.app.data.Message;
import com.hotel.app.data.Reservation;
import com.hotel.app.data.Room;
import com.hotel.config.HibernateConfig;

public class Reception {
	
	public Message getMessage() {
		Message message = new Message();
		message.setText("Welcome to our Hotel!");
		return message;
	}

	public Room createRoom(int floor,int number,int capacity,String attribute) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Room newRoom = Room.create(session, floor, number,capacity,attribute);
		session.close();
		return newRoom;
	}
	
	public Room[] getRoom(Integer... id){
		Session session = HibernateConfig.getSessionFactory().openSession();
	    CriteriaBuilder builder = session.getCriteriaBuilder();
	    CriteriaQuery<Room> query = builder.createQuery(Room.class);
	    Root<Room> variableRoot = query.from(Room.class);
	    query.select(variableRoot);
	    List<Room> rooms = session.createQuery(query).getResultList();
	    return rooms.toArray(new Room[rooms.size()]);
	}
	
	public Customer[] getCustomer(Integer... id){
		Session session = HibernateConfig.getSessionFactory().openSession();
	    CriteriaBuilder builder = session.getCriteriaBuilder();
	    CriteriaQuery<Customer> query = builder.createQuery(Customer.class);
	    Root<Customer> variableRoot = query.from(Customer.class);
	    query.select(variableRoot);
	    List<Customer> customers = session.createQuery(query).getResultList();
	    return customers.toArray(new Customer[customers.size()]);
	}

	public Reservation[] reservate(Room[] rooms,Customer customer,Date start,Date end) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		List<Reservation> reservations = new ArrayList<Reservation>();
		for (Room room : rooms) {
			if(room.isIsChecked()) {
				Reservation reservation = Reservation.create(session,customer,room,start,end);
				reservations.add(reservation);
			}
		}
		return reservations.toArray(new Reservation[reservations.size()]);
	}
}
