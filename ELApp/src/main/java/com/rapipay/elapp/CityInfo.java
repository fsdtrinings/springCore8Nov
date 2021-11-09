package com.rapipay.elapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component   // cityInfo
public class CityInfo {

	private List<String> cityNames = new ArrayList<String>();

	CityInfo()
	{
		cityNames.add("New Delhi");
		cityNames.add("Noida");
		cityNames.add("Banglore");
		cityNames.add("Mumbai");
		cityNames.add("Pune");
		
	}
	
	public List<String> getCityNames() {
		return cityNames;
	}

	public void setCityNames(List<String> cityNames) {
		this.cityNames = cityNames;
	}
	
	
	
	
	
}
