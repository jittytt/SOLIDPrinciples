package com.ilp.entity;

import java.util.ArrayList;

public class Orders {
	private String orderId;
	private ArrayList<Product> products;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public ArrayList<Product> getProducts() {
		return products;
	}
	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}
	public Orders(String orderId, ArrayList<Product> products) {
		super();
		this.orderId = orderId;
		this.products = products;
	}
}
