package com.operation;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.utility.SessionFact;

public class GreaterThan {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFact.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("salary", Double.valueOf(30000)));
		List<Employee> employees = cr.list();
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		tr.commit();
		session.close();
	
	}
}
