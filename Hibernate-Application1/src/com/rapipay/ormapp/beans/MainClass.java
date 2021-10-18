package com.rapipay.ormapp.beans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainClass {
	public static void main(String[] args) {
		
		MainClass appUseCase = new MainClass();
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session hibernate = factory.openSession();   // hibernate - session
		
		Employee e = new Employee("Amit", 2000, "Sales Exceutive");
		e.setPermanentAddress(new Address("ABC-123","Noida","Utter Pradesh"));
		e.setCurrentAddress(new Address("A-1","New Delhi","Delhi"));
		e.setAge(30);
		appUseCase.saveEmployee(e, hibernate);
		
		//Employee e = appUseCase.getEmployeeBasedOnId(1, hibernate);
		//System.out.println(e);
		
		
		hibernate.close();
	
	}//end main method
	
	public Employee getEmployeeBasedOnId(int id,Session hibernate)
	{
		Employee e = null;
		
		e = (Employee)hibernate.get(Employee.class,1);		
		return e;
	}
	
	
	public void saveEmployee(Employee e,Session hibernate)
	{
		System.out.println("1");
		//hibernate.beginTransaction();
		Transaction t = hibernate.beginTransaction();
		System.out.println("2");
		int savedObjectId = (int)hibernate.save(e);
		System.out.println("3");
		System.out.println("Employee Inserted "+e.getName()+" and "+savedObjectId);
		
		
		
		//hibernate.getTransaction().commit();
		t.commit();
	}
	
	
}//end main class



/*
 	
	
		
		 
   
  */
