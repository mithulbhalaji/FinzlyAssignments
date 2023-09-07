package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.entity.Book;
import com.util.SessionFact;


public class Save {
		public static void main(String[] args) {
			SessionFactory sf = SessionFact.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Book book = new Book("HJK","mithul",2008,"MIT123");
			session.save(book);
			tr.commit();
			session.close();
		}
}
