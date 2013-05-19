package org.hibernate.tutorial.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	@SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory(){
		try{
			ServiceRegistryBuilder srBuilder = new ServiceRegistryBuilder();
			ServiceRegistry serviceRegistry = srBuilder.buildServiceRegistry();
			return new Configuration().configure().buildSessionFactory(serviceRegistry );
		}
		catch(Throwable ex){
			System.err.println("Initial SessionFactory creation failed."+ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
