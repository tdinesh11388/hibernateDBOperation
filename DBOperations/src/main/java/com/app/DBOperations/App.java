package com.app.DBOperations;

import java.util.ArrayList;
import java.util.List;

import com.app.DBOperations.Entity.BankAccount;
import com.app.DBOperations.Entity.Customer;
import com.app.DBOperations.Repository.BankRepository;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<BankAccount>list=new ArrayList<BankAccount>();
        
        BankAccount bA = new BankAccount();
        bA.setName("SBI");
        bA.setAccountNumber("857256756776");
        
        BankAccount bA1 = new BankAccount();
        bA1.setName("BOI");
        bA1.setAccountNumber("7467456384574");
        
        BankAccount bA2 = new BankAccount();
        bA2.setName("UnionBank");
        bA2.setAccountNumber("0845287743563475");
        
        list.add(bA);
        list.add(bA1);
        list.add(bA2);
        
		Customer customer = new Customer();
		 customer.setName("Ashok");
		 customer.setAddress("AndhraPradesh");
		 customer.setAccounts(list);
		
		BankRepository bankRepository = new BankRepository();
		bankRepository.saveCustomer(customer);
    }
}
