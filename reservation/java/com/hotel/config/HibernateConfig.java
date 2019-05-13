package com.hotel.config;

public class HibernateConfig {/*
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
				Properties settings = new Properties();
				settings.put(Environment.DRIVER, "org.postgresql.Driver");
				settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/hotel");
				settings.put(Environment.USER, "postgres");
				// settings.put(Environment.PASS, "root");
				settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");
				settings.put(Environment.SHOW_SQL, "true");
				settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				settings.put(Environment.HBM2DDL_AUTO, "update");
				configuration.setProperties(settings);
				//Annotation Classes
				configuration.addAnnotatedClass(Adress.class);
				configuration.addAnnotatedClass(CheckIn.class);
				configuration.addAnnotatedClass(CheckOut.class);
				configuration.addAnnotatedClass(Customer.class);
				configuration.addAnnotatedClass(Employee.class);
				configuration.addAnnotatedClass(Room.class);
				configuration.addAnnotatedClass(Stay.class);
				configuration.addAnnotatedClass(Reservation.class);
				//Annotation Classes
				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();
				sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			} catch (Throwable t) {
				t.printStackTrace();
				System.out.println(t.getMessage());
			}
		}
		return sessionFactory;
	}
	*/
}
