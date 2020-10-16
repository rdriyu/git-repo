package com.lti.model;

public class Product {
	
	int productId;
	String productName;
	String produtDesription;
	int quantity;
	double price;
	
	
	public double getprice()
	{
		return price;
	}
	public int getQuantity()
	{
		return quantity;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdutDesription() {
		return produtDesription;
	}
	public void setProdutDesription(String produtDesription) {
		this.produtDesription = produtDesription;
	}
	
	

}
