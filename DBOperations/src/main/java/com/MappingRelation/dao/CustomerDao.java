package com.MappingRelation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.MappingRelation.conUtill.DataBaseCon;
import com.MappingRelation.entity.Cars;
import com.MappingRelation.entity.Customer;

public class CustomerDao 
{
	public static void saveDetailess(Cars customer)
	{
		Configuration con = new Configuration();
		con.addProperties(DataBaseCon.getConnection());
		con.addAnnotatedClass(Cars.class);
		con.addAnnotatedClass(Customer.class);
		
		SessionFactory fact = con.buildSessionFactory();
		Session session = fact.openSession();
		
		Transaction transcation = session.beginTransaction();
		session.merge(customer);
		transcation.commit();
	}
}
