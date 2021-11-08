package com.rapipay.app.model;

public class DeliveryInfo {
	
	private String courrierServiceName;
	private String location;
	public DeliveryInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DeliveryInfo(String courrierServiceName, String location) {
		super();
		this.courrierServiceName = courrierServiceName;
		this.location = location;
	}
	public String getCourrierServiceName() {
		return courrierServiceName;
	}
	public void setCourrierServiceName(String courrierServiceName) {
		this.courrierServiceName = courrierServiceName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
