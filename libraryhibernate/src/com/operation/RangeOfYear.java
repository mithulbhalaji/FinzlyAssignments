package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;
import com.util.SessionFact;

public class RangeOfYear {
		
	public static void main(String[] args) {
		SessionFactory sessionfactory = SessionFact.getSessionFactory();
		Session session = sessionfactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Book.class);
		criteria.add(Restrictions.between("pubyear", 1999, 2002));
		List<Book> rangeOfBooks = criteria.list();
		for (Book book : rangeOfBooks) {
			System.out.println(book);
		}
		session.close();
		
	}
}
