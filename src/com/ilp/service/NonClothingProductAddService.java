package com.ilp.service;

import java.util.HashMap;
import java.util.Map;

import com.ilp.entity.*;
import com.ilp.serviceinterface.ProductAddManager;

public class NonClothingProductAddService implements ProductAddManager{

	@Override
	public Map<String, Product> addProduct() {
		Map<String, Product> products = new HashMap<>();
		Category category = new Category("C2","Cars");
		Product product = new NonClothingProduct("SKU:2234", "Small car", "black", 230, "Plastic", "url1", "url2", "url3", category);
        products.put(product.getProductId(), product);
        System.out.println("Non-Clothing Product with ID " + product.getProductId() + " added.");
		return products;
	}
}
