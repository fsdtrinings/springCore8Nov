package com.rapipay.aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

	@Value("Mike")
	private String customerName;
	@Value("4000")
	private int balance;
	@Value("HSBC-Bank")
	private String bankName;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String customerName, int balance, String bankName) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.bankName = bankName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getBalance() {
		System.out.println("inside getBalance");
		return balance;
	}

	public void setBalance(int balance) {
		System.out.println("set balance called ...");
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	// ----- Business Methods ------

	public void transferFunds(int amount, String userId) {

		System.out.println(
				"transfer funds called " + this.customerName + " Amount " + amount + " to Customer :- " + userId);
	}

	public String changeBankName(String newBankName) throws Exception {
		String oldBankName = this.bankName;

		if (newBankName == null || newBankName.length() < 3) {
			throw new Exception("Invalid bank name exception " + newBankName);
		}

		this.setBankName(newBankName);
		return "Bank Name Changed from " + oldBankName + " to " + newBankName;
	}

	public void displayCustomerInfo() {
		String info = "Customer [customerName=" + customerName + ", balance=" + balance + ", bankName=" + bankName
				+ "]";
		System.out.println(info);
	}

}
