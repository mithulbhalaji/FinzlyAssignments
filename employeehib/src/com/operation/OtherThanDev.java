package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.utility.SessionFact;

public class OtherThanDev {
	public static void main(String[] args) {
		SessionFactory sessionFactory= SessionFact.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria cr = session.createCriteria(Employee.class);
		cr.add(Restrictions.ne("department", "dev"));
		List<Employee> employees = cr.list();
		for (Employee emp : employees) {
			System.out.println(emp);
		}
		tr.commit();
		session.close();
	}
}
