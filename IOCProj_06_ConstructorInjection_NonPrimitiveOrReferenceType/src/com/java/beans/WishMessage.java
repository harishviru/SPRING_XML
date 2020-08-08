package com.java.beans;

/**
 * Here we are 1-param constructor 
 */
public class WishMessage {

	private String message;
	
	static{
		System.out.println("WishMessage.StaticBlock ..........!");
	}
	
	public WishMessage(String message) 
	{
		System.out.println("WishMessage. 1-param constructor");
		 this.message=message;
	}

	public String getMessage() {
		return message;
	}
	
}
