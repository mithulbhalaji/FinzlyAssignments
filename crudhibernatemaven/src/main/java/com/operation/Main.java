package com.operation;

import com.entity.UserLogin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(UserLogin.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        UserLogin user = session.get(UserLogin.class,1);
        System.out.println(user);
        UserLogin updateUser = new UserLogin(3,"mithul@gmail.com","mithulbhalaji");
        session.update(updateUser);
        session.delete(updateUser);
        transaction.commit();
        session.close();
    }
}
