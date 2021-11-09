package com.rapipay.app.model;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("laptop-3")
@Scope("prototype")
@Lazy
public class Product {
	
	@Value("${laptop-name}")
	private String productName;
	private int productId;
	@Value("2000")
	private int cost;
	@Autowired
	@Qualifier("nbfi")
	private EMI emi;
	@Autowired
	@Lazy
	private DeliveryInfo deliveryInfo;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productName, int cost) {
		super();
		this.productName = productName;
		this.cost = cost;
	}
	
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	public EMI getEmi() {
		return emi;
	}

	public void setEmi(EMI emi) {
		this.emi = emi;
	}

	public DeliveryInfo getDeliveryInfo() {
		return deliveryInfo;
	}

	public void setDeliveryInfo(DeliveryInfo deliveryInfo) {
		this.deliveryInfo = deliveryInfo;
	}
	
	
	public void doInitThings()
	{
		System.out.println("do init things called");
	}
	
	public void doDestroyThings()
	{
		System.out.println("do Destroyable things called");
	}
	
	
	

}
