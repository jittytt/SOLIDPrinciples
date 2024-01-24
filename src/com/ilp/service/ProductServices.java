package com.ilp.service;

import java.util.Map;

import com.ilp.entity.ClothingProduct;
import com.ilp.entity.NonClothingProduct;
import com.ilp.entity.Product;
import com.ilp.serviceinterface.ProductDeleteManager;
import com.ilp.serviceinterface.ProductDisplayManager;

public class ProductServices implements ProductDeleteManager, ProductDisplayManager{

	@Override
	public void deleteProduct(String productId, Map<String, Product> products) {
		 if(products.containsKey(productId)) {
	            products.remove(productId);
	            System.out.println("Product with ID " + productId + " deleted.");
	        } else {
	            System.out.println("Product with ID " + productId + " not found.");
	        }
	}

	@Override
	public void displayProduct(String productId, Map<String, Product> products) {
		if (products.containsKey(productId)) {
            Product product = products.get(productId);
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getProductPrice());
            if (product instanceof ClothingProduct) {
                System.out.println("Size: " + ((ClothingProduct) product).getSize());
            } else if (product instanceof NonClothingProduct) {
                System.out.println("Category: " + ((NonClothingProduct) product).getCategory());
            }
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }
	}
	
	@Override
	public void displayAllProducts(Map<String, Product> products) {
		for (Map.Entry<String, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            System.out.println("Product ID: " + product.getProductId() + ", Name: " + product.getProductName() + ", Price: " + product.getProductPrice());
            if (product instanceof ClothingProduct) {
                System.out.println("Size: " + ((ClothingProduct) product).getProductPrice());
            } else if (product instanceof NonClothingProduct) {
                System.out.println("Category: " + ((NonClothingProduct) product).getCategory());
            }
        }
    }	
}

