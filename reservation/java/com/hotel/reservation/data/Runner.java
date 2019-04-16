package com.hotel.reservation.data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

 
public class Runner {
     
    public void createRoom() {
        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
         
        create(session);
         
        session.close();
    }
 
    private void create(Session session) {
        Room room = new Room();
        room.setFloor(0);
        room.setNumber(1);
         
        session.beginTransaction();
        session.save(room);
        session.getTransaction().commit();
    }

}