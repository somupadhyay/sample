package org.hibernate.tutorial.hbm.util;

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
<<<<<<< HEAD:hibernate-tutorials/src/main/java/org/hibernate/tutorial/util/HibernateUtil.java
			return new Configuration().configure().buildSessionFactory(/*serviceRegistry*/ );
=======
			return new Configuration().configure().buildSessionFactory(/*serviceRegistry */);
>>>>>>> 08237280e9107df9f6e6c76668818d835f84a614:hibernate-tutorials/src/main/java/org/hibernate/tutorial/hbm/util/HibernateUtil.java
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
