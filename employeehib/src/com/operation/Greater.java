package com.operation;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;

import com.entity.Employee;
import com.utility.SessionFact;

public class Greater {
	public static void main(String[] args) {
		SessionFactory sessionFactory= SessionFact.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.addOrder(Order.desc("salary"));
		List<Employee> employees = cr.list();
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		tr.commit();
		session.close();
	}
}
