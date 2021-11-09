package com.rapipay.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		Customer customer = (Customer)spring.getBean("customer");
		// user action 
		
		try {
			customer.changeBankName("ABC-New Bank");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		/*
		customer.displayCustomerInfo();
		System.out.println("-----------------------");
		
		customer.getBalance();
		
		System.out.println("-----------------------");
		customer.setBalance(8000);
		
		*/
		/*
		customer.transferFunds(2000, "jenny 123");
		String msg = customer.changeBankName("CITY Bank");
		System.out.println(msg);
		*/
	}
}
