package com.rapipay.ormapp.beans;

public class DemoApp {

	public static void main(String[] args) {
		
		System.out.println("1");
		
		try {
			Thread.sleep(1500);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(10/0);
		
		System.out.println("2");
	}
}
