package com.java.beans;

public class Flipkart {

	private String uName;
	private Product product;	
	
	static{
		System.out.println("Flipkart. Static Block........!");
	}
	
	public Flipkart() {
		System.out.println("Flipkart. 0-param constructor");
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Flipkart [uName=" + uName + ", product=" + product + "]";
	}
}
