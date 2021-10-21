package com.rapipay.ormapp.beans;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();   // hibernate - session
		
		//readAllData(session);
		//System.out.println("--------------------------------------------------------");
		//readPartialData(session);
		//parameterBasedQuery(session,1);
		//updateDesignation(session,"ABC",1);
		callNamedQuery(session);
	}
	
	public static void callNamedQuery(Session session)
	{
		Query q =session.getNamedQuery("QueryForTotalEmpCount");
		int count =(int)q.uniqueResult();
		System.out.println("Total Employees Count :- "+count);
	}
	
	
	
	public static void readAllData(Session session)
	{
		// SQL :- Select * from Rapiemployee
		String hqlQuery = "from Employee e";  // Employee is the entity name or class name
		Query q = session.createQuery(hqlQuery);
		// ResultSet rs = ps.executeQuery();
		List<Employee> list =  q.list();
		System.out.println("Total Data Count:- "+list.size());
		list.stream().forEach((e)->System.out.println(e));
	
	}
	
	public static void readPartialData(Session session)
	{

		String hqlQuery = "select e.id,e.salary,e.designation from Employee e"; 
		Query q = session.createQuery(hqlQuery);
		
		List list =  q.list();
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			Object record[] = (Object[])itr.next();
			System.out.println(record[0]+" - "+record[1]+" - "+record[2]);
			
		}
	
	}
	
	public static void parameterBasedQuery(Session session,int userInputId)
	{
		String query = "from Employee where id = :userInput";
		Query q = session.createQuery(query);
		q.setInteger("userInput", userInputId);
		List list =  q.list();
		System.out.println(list);
		
		/*
		 * ----In JDBC ---
		 * ps = con.preparedStatement("select * from employee where id = ?");
		 * ps.setInt(1,userInputId);
		 * 
		 * */
		
	}
	
	public static void updateDesignation(Session session,String newUpdateDesignation,int empid)
	{
		
		Transaction t = session.beginTransaction();
		//SQL  = update RapipayEmployee set designation = ? where id = ?
		
		String hqlQuery = "update Employee set designation = :newDesignation where id = :empId";
		Query q = session.createQuery(hqlQuery);
		q.setString("newDesignation", newUpdateDesignation);
		q.setInteger("empId", empid);
		int res = q.executeUpdate();
		
		
		t.commit();
		System.out.println("No of Rows updated :- "+res);
		
	}
	
}













