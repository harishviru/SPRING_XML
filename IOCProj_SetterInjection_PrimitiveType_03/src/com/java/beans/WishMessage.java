package com.java.beans;

public class WishMessage {

	private String message;
	
	static{
		System.out.println("WishMessage.StaticBlock ..........!");
	}
	
	public WishMessage() {
		System.out.println("WishMessage. 0-param constructor");
	}
	
	public void setMessage(String message) {
		System.out.println("WishMessage.setMessage() Method........!");
		this.message = message;
	}
	
	public String getMessage() {
		System.out.println("WishMessage.getMessage() Method........!");
		return message;
	}
	
}
