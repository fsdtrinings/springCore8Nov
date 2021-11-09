package com.rapipay.app.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rapipay.app.config.ProductConfig;
import com.rapipay.app.model.Product;

/**
 * App 2 
 * */
public class MainClass2 {

	public static void main(String[] args) {
		/** 
		 * This is Spring annotation application context for Product class
		 * */
		AnnotationConfigApplicationContext springContext =
				 new AnnotationConfigApplicationContext(ProductConfig.class);
		
		Product p =(Product)springContext.getBean("laptop-3");
		System.out.println(p);
	}
}



/**
 *   <h1> This is Main Class </h1>  
 *    javadoc <FileName> 
 **/
 