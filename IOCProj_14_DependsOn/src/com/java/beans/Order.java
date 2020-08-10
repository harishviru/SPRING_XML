package com.java.beans;

public class Order {

	private String orderId;
    private String address;
	
	static{
		System.out.println("Order. Static Block...!");
	}
	
	public Order() {
		System.out.println("Order. 0-param constructor...!");
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", address=" + address + "]";
	}
	
}
