package com.rapipay.elapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		
		Customer c = (Customer)context.getBean("customer");
		System.out.println(c);
	}
}
