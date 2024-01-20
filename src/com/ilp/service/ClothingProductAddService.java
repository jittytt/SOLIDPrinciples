package com.ilp.service;

import java.util.HashMap;
import java.util.Map;

import com.ilp.entity.*;
import com.ilp.serviceinterface.ProductAddManager;

public class ClothingProductAddService implements ProductAddManager{

	@Override
	public Map<String, Product> addProduct() {
	    Map<String, Product> products = new HashMap<>();
		Category category = new Category("C1","Clothing");
		Product product = new ClothingProduct("SKU:1925", "Jacket", "blue", 120, "Leather", "url1", "url2", "url3", category, 'm');
		System.out.println(product.getProductId());
        products.put(product.getProductId(), product);
        System.out.println("Clothing Product with ID " + product.getProductId() + " added.");
		return products;
	}
	
}
