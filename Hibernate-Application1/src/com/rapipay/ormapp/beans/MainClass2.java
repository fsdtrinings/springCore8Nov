package com.rapipay.ormapp.beans;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass2 {
	
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		//Session hibernate = factory.openSession();   // hibernate - session
		
		
		
		/*
		
		
		
		Employee e1 = new Employee();
		e1.setName("Sumit");
		e1.setSalary(2000);
		e1.setDesignation("New Designation");
		Employee e2 = new Employee("Sumit", 3000, "A");
		Employee e3 = new Employee("Sumit", 5000, "A");
		Employee e4 = new Employee("Sumit", 6000, "A");
		
		Set<Employee> employSet = new HashSet<>();
		employSet.addAll(Arrays.asList(e1,e2,e3,e4));
		
		
		Organisation org = new Organisation();
		org.setOrgName("Rapipay");
		org.setEmployees(employSet);
		
		Transaction t = hibernate.beginTransaction();
		System.out.println("1");
		hibernate.save(e1);
		hibernate.save(e2);
		hibernate.save(e3);
		hibernate.save(e4);
		System.out.println("2");
		hibernate.save(org);
		System.out.println("3");
		t.commit();
		hibernate.close();
		System.out.println("--- done ---");
		*/
		
		Session hibernate2 = factory.openSession();   // hibernate - session
		
		Employee e = (Employee)hibernate2.get(Employee.class, 1);
		System.out.println(e.getOrg().getOrgName());
		// ---- 
		hibernate2.close();
		
		e = (Employee)hibernate2.get(Employee.class, 1);
		System.out.println(e.getName());
		
		
		
	}//end main

}//end class
