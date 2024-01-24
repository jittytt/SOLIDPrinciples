package com.ilp.entity;

public abstract class Product{
	private String productId;
	private String productName;
	private String productColor;
	private double productPrice;
	private String productDescription;
	private String displayImageUrl1;
	private String displayImageUrl2;
	private String displayImageUrl3;
	private Category category;

	public Product(String productId, String productName, String productColor, double productPrice,
			String productDescription, String displayImageUrl1, String displayImageUrl2, String displayImageUrl3,
			Category category) {
		this.productId = productId;
		this.productName = productName;
		this.productColor = productColor;
		this.productPrice = productPrice;
		this.productDescription = productDescription;
		this.displayImageUrl1 = displayImageUrl1;
		this.displayImageUrl2 = displayImageUrl2;
		this.displayImageUrl3 = displayImageUrl3;
		this.category = category;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getDisplayImageUrl1() {
		return displayImageUrl1;
	}

	public void setDisplayImageUrl1(String displayImageUrl1) {
		this.displayImageUrl1 = displayImageUrl1;
	}

	public String getDisplayImageUrl2() {
		return displayImageUrl2;
	}

	public void setDisplayImageUrl2(String displayImageUrl2) {
		this.displayImageUrl2 = displayImageUrl2;
	}

	public String getDisplayImageUrl3() {
		return displayImageUrl3;
	}

	public void setDisplayImageUrl3(String displayImageUrl3) {
		this.displayImageUrl3 = displayImageUrl3;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
