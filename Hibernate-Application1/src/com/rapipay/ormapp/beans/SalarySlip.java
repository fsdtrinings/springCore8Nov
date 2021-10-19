package com.rapipay.ormapp.beans;

import java.time.LocalDate;

import javax.persistence.Embeddable;

@Embeddable
public class SalarySlip {
	
	private LocalDate salarySlipDate;
	private int slipId;
	public SalarySlip() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalarySlip(LocalDate salarySlipDate, int slipId) {
		super();
		this.salarySlipDate = salarySlipDate;
		this.slipId = slipId;
	}
	public LocalDate getSalarySlipDate() {
		return salarySlipDate;
	}
	public void setSalarySlipDate(LocalDate salarySlipDate) {
		this.salarySlipDate = salarySlipDate;
	}
	public int getSlipId() {
		return slipId;
	}
	public void setSlipId(int slipId) {
		this.slipId = slipId;
	}
	
	
	

}
