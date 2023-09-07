package com.operation;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Book;
import com.util.SessionFact;

public class UpdateBook {
		public static void main(String[] args) {
			SessionFactory sf = SessionFact.getSessionFactory();
			Session session = sf.openSession();
			Transaction tr = session.beginTransaction();
			Book updateBook = new Book("HJK","Mithulbhalaji",2011,"MIT123");
			session.update(updateBook);
			tr.commit();
			session.close();
		}
}
