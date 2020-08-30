package com.java.beans;

public class Student {

	private String sId;
	private String studName;
	
	public Student() {
		System.out.println("Student -0-param constructor");
	}
	
	public void setsId(String sId) {
		this.sId = sId;
	}
	
	public void setStudName(String studName) {
		this.studName = studName;
	}
	
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", studName=" + studName + "]";
	}	
}
