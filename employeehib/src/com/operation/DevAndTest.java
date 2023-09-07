package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.utility.SessionFact;

public class DevAndTest {
	public static void main(String[] args) {
		SessionFactory sessionFactory = SessionFact.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tr= session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.in("department", "dev","test"));
		List<Employee> emp = cr.list();
		for (Employee employee : emp) {
			System.out.println(employee);
		}
		tr.commit();
		session.close();
		
	}
}
