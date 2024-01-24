package com.ilp.serviceinterface;

import java.util.Map;
import com.ilp.entity.Product;


public interface ProductDisplayManager {
	void displayProduct(String productId, Map<String, Product> products);
    void displayAllProducts(Map<String, Product> products);
}
