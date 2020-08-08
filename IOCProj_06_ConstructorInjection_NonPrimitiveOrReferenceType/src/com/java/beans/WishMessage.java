package com.java.beans;


public class WishMessage {

	private String message;
	
	static{
		System.out.println("WishMessage.StaticBlock ..........!");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
}
