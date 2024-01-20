package com.ilp.serviceinterface;

import java.util.Map;

import com.ilp.entity.Product;

public interface ProductDeleteManager {
	void deleteProduct(String productId, Map<String, Product> products);
}
