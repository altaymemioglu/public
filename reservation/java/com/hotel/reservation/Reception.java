package com.hotel.reservation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hotel.hibernate.HotelSessionFactory;
import com.hotel.reservation.data.Room;

public class Reception {
	
	public Object getMessage() {
		return "Welcone to our Hotel!";
	}

	public void createRoom(int floor,int number) {
		SessionFactory sessionFactory = HotelSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();

		Room.create(session, floor, number);

		session.close();
	}

}
