package com.rapipay.app.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rapipay.app.model.NonBankingFinanceInsititurions;
import com.rapipay.app.model.Product;

public class MainCode {

	public static void main(String[] args) {
		
		
		// Product p = new Product();
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		/*
		 * Product p1 = (Product)spring.getBean("laptop-1");
		 * System.out.println(p1.getProductName());
		 */	
		
		
		Product p2 = (Product)spring.getBean("laptop-3");
		System.out.println(p2.getProductName()+" cost "+p2.getCost()); 
		p2.setCost(8000);
		System.out.println(p2.getProductName()+" cost after update "+p2.getCost()); 
		System.out.println(p2.getEmi().getBankName()+" - "+p2.getEmi().getEmiAmount());
		System.out.println(p2.getDeliveryInfo().getCourrierServiceName());
		
		p2 = (Product)spring.getBean("laptop-3");
		System.out.println(p2.getProductName()+" New Get bean cost "+p2.getCost());
		
		
		NonBankingFinanceInsititurions nbfi = (NonBankingFinanceInsititurions)p2.getEmi();
		System.out.println("\n\n\n "+nbfi.getinfo());
	
	}
}
