package com.rapipay.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emi")
public class EMI {

	@Value("Kotak Mahindra Bank")
	private String bankName;
	private int emiAmount;
	private int emiCounts;
	public EMI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EMI(String bankName, int emiAmount, int emiCounts) {
		super();
		this.bankName = bankName;
		this.emiAmount = emiAmount;
		this.emiCounts = emiCounts;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(int emiAmount) {
		this.emiAmount = emiAmount;
	}
	public int getEmiCounts() {
		return emiCounts;
	}
	public void setEmiCounts(int emiCounts) {
		this.emiCounts = emiCounts;
	}
	
	
}
