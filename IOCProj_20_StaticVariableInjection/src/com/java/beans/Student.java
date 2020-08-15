package com.java.beans;

public class Student {

	private static String studName;
	
	 public  void setStudName(String studName) {
		Student.studName = studName;
	}
	
	 public static String getStudName() {
		return studName;
	}
	
}
