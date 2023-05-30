package com.app.DBOperations.Util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.DBOperations.Entity.BankAccount;
import com.app.DBOperations.Entity.Course;
import com.app.DBOperations.Entity.Customer;
import com.app.DBOperations.Entity.Student;

public class SessionFactoryUtill 
{

	private static SessionFactory sessionfactory=null;
	
	static{
		Configuration cfg = new Configuration();
		cfg.setProperties(MySqlConnection.getConnectionProperties());
		//cfg.addAnnotatedClass(Customer.class);
		//cfg.addAnnotatedClass(BankAccount.class);
		cfg.addAnnotatedClass(Course.class);
		cfg.addAnnotatedClass(Student.class);
		sessionfactory = cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory()
	{
		return sessionfactory;
	}
}
