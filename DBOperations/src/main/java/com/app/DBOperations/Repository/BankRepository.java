package com.app.DBOperations.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.DBOperations.Entity.Customer;
import com.app.DBOperations.Util.SessionFactoryUtill;

public class BankRepository 
{
	public void saveCustomer(Customer customer)
	{
		SessionFactory sessionFactory = SessionFactoryUtill.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transcation = session.beginTransaction();
		session.save(customer);
		transcation.commit();
		session.close();
	}
}
