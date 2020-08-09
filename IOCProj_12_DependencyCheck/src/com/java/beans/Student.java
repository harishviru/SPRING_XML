package com.java.beans;

public class Student {

	private String studId;
	private String studName;

	static{
		System.out.println("Student. Static Block..........!");
	}
	
	public Student() {
		System.out.println("Student. 0-param constructor.....!");
	}

	public String getStudId() {
		return studId;
	}

	public void setStudId(String studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}	

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}

}
