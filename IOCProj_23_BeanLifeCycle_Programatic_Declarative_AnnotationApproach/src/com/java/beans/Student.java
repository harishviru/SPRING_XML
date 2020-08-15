package com.java.beans;

/**
 * #Declarative Approach
 *
 */
public class Student {

	private String studName;
	
	public Student() {
		System.out.println("Student. 0-param constructor.!");
	}
	
	public void setStudName(String studName) {
		System.out.println("Student.setStudName()");
		this.studName = studName;
	}
	
	public String getStudName() {
		return studName;
	}

	public void myInit() throws Exception {
       System.out.println("aftersetting properties...............Student.myInit()");
	}
	
	public void myDestroy() throws Exception {
		System.out.println("Student.myDestroy()");
	}
}
