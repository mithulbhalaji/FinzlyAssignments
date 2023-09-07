package com.operation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.utility.SessionFact;

public class Create {
		public static void main(String[] args) {
			SessionFactory sessionfactory = SessionFact.getSessionFactory();
			Session session = sessionfactory.openSession();
			Transaction tr = session.beginTransaction();
			Employee emp = new Employee();
			emp.setId(1);
			emp.setfName("Tharun");
			emp.setlName("krithik");
			emp.setDate("01.02.2015");
			emp.setMail("tharun@gmail.com");
			emp.setDepartment("dev");
			emp.setSalary(1000000);
			session.save(emp);
			tr.commit();
			session.close();
		}
}
