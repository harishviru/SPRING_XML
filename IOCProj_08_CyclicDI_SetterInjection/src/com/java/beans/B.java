package com.java.beans;

public class B {
	
	private A  a;
	
	static{
		System.out.println("B.Static Block");
	}
	public B() {
		 System.out.println("B. 0-param constructor");
	}
	
	public void setA(A a) {
		System.out.println("B.setA() Method..!"+a);
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a=" + a + "]";
	}
	
}
