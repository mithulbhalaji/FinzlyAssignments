package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class SessionFact {
	
	private SessionFact() {
	
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Employee.class);
		return config.buildSessionFactory();
		
	}
	
}
