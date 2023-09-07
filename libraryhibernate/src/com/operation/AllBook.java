package com.operation;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;
import com.util.SessionFact;

public class AllBook {
		public static void main(String[] args) {
			SessionFactory sf = SessionFact.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Criteria criteria = session.createCriteria(Book.class);
			List<Book> resultBook = criteria.list();
			for (Book book : resultBook) {
				System.out.println(book);
			}
			tr.commit();
			session.close();
		}
}
