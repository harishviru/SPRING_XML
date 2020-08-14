package com.java.beans;

public class Order {

	private String orderId;
	private Address address;
	
	public Order() {
		System.out.println("Order. o-param constructor...!");
	}
	
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", address=" + address + "]";
	}
}
