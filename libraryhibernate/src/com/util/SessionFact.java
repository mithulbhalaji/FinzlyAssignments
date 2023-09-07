package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Book;

public class SessionFact {

		private SessionFact() {
			
		}
		
		public static SessionFactory getSessionFactory() {
			Configuration cfg = new Configuration();
	        cfg.configure();
	        cfg.addAnnotatedClass(Book.class);
	        return cfg.buildSessionFactory();
		}
		
		
}
