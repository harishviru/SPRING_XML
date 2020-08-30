package com.java.beans;

public class Student extends Person{

	private String sId;
	
	public Student() {
		System.out.println("Student -0-param constructor");
	}
	
	public void setsId(String sId) {
		this.sId = sId;
	}
	

	@Override
	public String toString() {
		return "Student [sId=" + sId +  "]";
	}	
}
