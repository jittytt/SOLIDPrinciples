package com.ilp.entity;

public class ClothingProduct extends Product {
	private char size;

	public ClothingProduct(String productId, String productName, String productColor, double productPrice,
			String productDescription, String displayImageUrl1, String displayImageUrl2, String displayImageUrl3,
			Category category, char size) {
		super(productId, productName, productColor, productPrice, productDescription, displayImageUrl1,
				displayImageUrl2, displayImageUrl3, category);
		this.size = size;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

}
