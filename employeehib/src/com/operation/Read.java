package com.operation;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import com.entity.Employee;
import com.utility.SessionFact;

public class Read {

	public static void main(String[] args) {
		SessionFactory sessionfactory = SessionFact.getSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction tr = session.beginTransaction();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", 1));
		List<Employee> employee = criteria.list();
		criteria.add(Restrictions.eq("id", 1));
		List<Employee> employeeWithId = criteria.list();
	
		
		for(Employee emp: employee) {
			System.out.println(emp);
		}
		for(Employee emp: employeeWithId) {
			System.out.println(emp);
		}
		tr.commit();
		session.close();
		
	}
	
}
