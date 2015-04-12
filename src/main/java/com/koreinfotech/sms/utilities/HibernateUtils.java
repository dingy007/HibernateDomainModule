package com.koreinfotech.sms.utilities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory sessionFactory = null;
	
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory==null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			// /HibernateDomainModule/src/hibernate.cfg.xml
			StandardServiceRegistryBuilder standardServiceRegistryBuilder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
			sessionFactory = configuration.buildSessionFactory(standardServiceRegistryBuilder.build());
		}
		return sessionFactory;
	}
	
	public static Session getCurrentSession() {
		return getSessionFactory().getCurrentSession();
	}
	
	public static Session openSession() {
		return getSessionFactory().openSession();
	}
	
	public static void closeSession(Session session){
		if (session.isOpen()){
			session.close();
		}
	}
	public static void closeSessionFactory() {
		if (sessionFactory != null) {
			sessionFactory.close();
		}
	}
}
