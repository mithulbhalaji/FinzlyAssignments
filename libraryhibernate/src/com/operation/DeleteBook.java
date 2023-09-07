package com.operation;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;
import com.util.SessionFact;

public class DeleteBook {
		public static void main(String[] args) {
			SessionFactory sf = SessionFact.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Book deleteBook = new Book("HJK","Mithulbhalaji",2011,"MIT123");
			session.delete(deleteBook);
			tr.commit();
			session.close();
		}
}
