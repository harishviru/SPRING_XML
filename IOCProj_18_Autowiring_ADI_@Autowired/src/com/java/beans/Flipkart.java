package com.java.beans;

public class Flipkart {

	private Order order;
	
	public Flipkart() {
		System.out.println("Flipkart. 0-param constructor...!");
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "Flipkart [order=" + order + "]";
	}
	
	
}
