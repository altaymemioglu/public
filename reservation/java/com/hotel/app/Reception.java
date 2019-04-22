package com.hotel.app;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.hotel.app.data.Message;
import com.hotel.app.data.Room;
import com.hotel.config.HibernateConfig;

public class Reception {
	
	public Message getMessage() {
		Message message = new Message();
		message.setText("Welcome to our Hotel!");
		return message;
	}

	public Room createRoom(int floor,int number) {
		Session session = HibernateConfig.getSessionFactory().openSession();
		Room newRoom = Room.create(session, floor, number);
		session.close();
		return newRoom;
	}
	
	public List<Room> getRoom(Integer... id){
		Session session = HibernateConfig.getSessionFactory().openSession();
	    CriteriaBuilder builder = session.getCriteriaBuilder();
	    CriteriaQuery<Room> query = builder.createQuery(Room.class);
	    Root<Room> variableRoot = query.from(Room.class);
	    query.select(variableRoot);
	    return session.createQuery(query).getResultList();
	}

}
