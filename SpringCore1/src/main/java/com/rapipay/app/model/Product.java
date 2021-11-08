package com.rapipay.app.model;

public class Product {
	
	private String productName;
	private int productId;
	private int cost;
	
	
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
	
	

}
