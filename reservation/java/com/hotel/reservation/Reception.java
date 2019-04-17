package com.hotel.reservation;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hotel.hibernate.HotelSessionFactory;
import com.hotel.reservation.data.Message;
import com.hotel.reservation.data.Room;

public class Reception {
	
	public Message getMessage() {
		Message message = new Message();
		message.setText("Welcome to our Hotel!");
		return message;
	}

	public Room createRoom(int floor,int number) {
		SessionFactory sessionFactory = HotelSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		Room newRoom = Room.create(session, floor, number);
		session.close();
		return newRoom;
	}
	
	public List<Room> getRoom(Integer... id){
		SessionFactory sessionFactory = HotelSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
	    CriteriaBuilder builder = session.getCriteriaBuilder();
	    CriteriaQuery<Room> query = builder.createQuery(Room.class);
	    Root<Room> variableRoot = query.from(Room.class);
	    query.select(variableRoot);
	    return session.createQuery(query).getResultList();
	}

}
