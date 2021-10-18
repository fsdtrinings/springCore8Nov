package com.rapipay.ormapp.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	@Column(nullable = false)
	private String houseNumber;
	@Column(nullable = false)
	private String cityName;
	@Column(nullable = false)
	private String stateName;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNumber, String cityName, String stateName) {
		super();
		this.houseNumber = houseNumber;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
	
}
