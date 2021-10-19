package com.rapipay.ormapp.beans;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

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
		/*
		Employee e = new Employee("Rakesh", 12000, "Sales Exceutive");
		e.setPermanentAddress(new Address("ABC-123","Noida","Utter Pradesh"));
		e.setCurrentAddress(new Address("A-1","New Delhi","Delhi"));
		e.setAge(30);
		appUseCase.saveEmployee(e, hibernate);
		*/
		
		
		
		Employee e = appUseCase.getEmployeeBasedOnId(8, hibernate);
		System.out.println(e);
		
		
		
	
	}//end main method
	
	public Employee getEmployeeBasedOnId(int id,Session hibernate)
	{
		Employee e = null;
		
		e = (Employee)hibernate.get(Employee.class,8);
		hibernate.close();
		List<SalarySlip> list = e.getSalaryslips();
		System.out.println(list.size());
		
		return e;
	}
	
	
	public void saveEmployee(Employee e,Session hibernate)
	{
		System.out.println("1");System.out.println("2");
		
		SalarySlip s1 = new SalarySlip(LocalDate.now(), 1);
		SalarySlip s2 = new SalarySlip(LocalDate.of(2021, 1, 2),2);
		SalarySlip s3 = new SalarySlip(LocalDate.of(2021, 6, 5), 3);
		
		List<SalarySlip> slips = Arrays.asList(s1,s2,s3);
		
		Transaction t = hibernate.beginTransaction();
		
		e.setSalaryslips(slips);
		hibernate.save(e);
		
		
		t.commit();
		hibernate.close();
	}
	
	
}//end main class



/*
 	
	
		
		 
   
  */
