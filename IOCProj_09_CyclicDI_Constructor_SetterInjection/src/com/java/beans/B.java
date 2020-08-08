package com.java.beans;

public class B {
	
	private A  a;
	
	static{
		System.out.println("B.Static Block");
	}
	
	public B(A a) {
		 System.out.println("B. 1-param constructor");
			this.a = a;
	}
	
}
