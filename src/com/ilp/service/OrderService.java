package com.ilp.service;

import java.util.Map;

import com.ilp.entity.Product;
import com.ilp.serviceinterface.ProductAddManager;
import com.ilp.serviceinterface.ProductDisplayManager;

public class OrderService implements ProductAddManager, ProductDisplayManager{
	public void clearCart() {
		System.out.println("Clearing cart....");
	}
	public void calculateAmount() {
		System.out.println("Total amount....");
	}
	@Override
	public void displayProduct(String productId, Map<String, Product> products) {
		System.out.println("Displaying single product...");
	}
	@Override
	public void displayAllProducts(Map<String, Product> products) {
		System.out.println("Displaying all products...");
	}
	@Override
	public Map<String, Product> addProduct() {
		return 
	}
}
