package com.rapipay.elapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component  // RapipayCustomer -> rapipayCustomer
public class Customer {

	@Value("#{'Mr.'+'${name}'}")
	private String customerName;
	private int customerId;
	
	@Value("#{2000+2000}")
	private int balance;   // 4000

	@Value("#{customer.balance>5000 ? customer.balance*0.05 : customer.balance*0.03}")
	private int cashBack;
	
	// @Value("#{10 == 10 && 10 < 100}")
	@Value("#{10==10?true:false}")
	private boolean flag;
	
	@Value("#{cityInfo.cityNames[0]}")  
	private String city;
	
	
	
	
	
	public Customer(String customerName, int customerId, int balance, int cashBack, boolean flag) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.balance = balance;
		this.cashBack = cashBack;
		this.flag = flag;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getCashBack() {
		return cashBack;
	}
	public void setCashBack(int cashBack) {
		this.cashBack = cashBack;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", balance=" + balance
				+ ", cashBack=" + cashBack + ", flag=" + flag + ", city=" + city + "]";
	}

	
	
	
	
}
