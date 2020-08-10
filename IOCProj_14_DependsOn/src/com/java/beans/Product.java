package com.java.beans;

public class Product {

	private String prodId;
	private String prodName;
	private Order order;
	
	static{
		System.out.println("Product.  Static Block.....!");
	}
	
	public Product() {
		System.out.println("Product. 0-param contructor...!");
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", order=" + order + "]";
	}
}
