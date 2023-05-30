package com.MappingRelation.MainClass;

import java.util.ArrayList;
import java.util.List;

import com.MappingRelation.dao.CustomerDao;
import com.MappingRelation.entity.Cars;
import com.MappingRelation.entity.Customer;


public class App 
{
	public static void main(String[] args) 
	{
		Customer customer = new Customer();
		customer.setName("Dinesh");
		customer.setAge("20");
		
		
		Cars c1 = new Cars();
		c1.setName("Tyoato");
		c1.setPrice("95546");
		c1.setCustomer(customer);
		
		Cars c2 = new Cars();
		c2.setName("tata");
		c2.setPrice("34lk");
		c2.setCustomer(customer);
		
		CustomerDao customerDao = new CustomerDao();
		
		customerDao.saveDetailess(c2);
		
//	
//		List<Cars> list = new ArrayList<Cars>();
//		
//		Cars cars = new Cars();
//		cars.setName("Audi");
//		cars.setPrice("40Lakhs");
//		
//		Cars cars2 = new Cars();
//		cars2.setName("TATA");
//		cars2.setPrice("10Lakhs");
//		
//		Cars cars3 = new Cars();
//		cars3.setName("Ford");
//		cars3.setPrice("12lakhs");
//		
//		list.add(cars);
//		list.add(cars2);
//		list.add(cars3);
//		
//		
//		Customer customer = new Customer();
//		customer.setName("clavin");
//		customer.setAge("23");
//		customer.setCars(list);
//		
//		
		//CustomerDao customerDao = new CustomerDao();
		
		
		
		
	}
}
