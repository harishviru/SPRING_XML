package com.java.beans;

public class A {
	
	private B  b;
	
	static{
		System.out.println("A.Static Block");
	}
	
	public A() {
		 System.out.println("A. 0-param constructor");
	}
	
	public void setB(B b) {
		System.out.println("A.setB() Method....!"+b);
		this.b = b;
	}
	
}
