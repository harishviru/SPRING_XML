package com.java.beans;

public class Employee {

	private static String empName;
	
	  public static void setEmpName(String empName) {
		Employee.empName = empName;
	}
	
	  public static String getEmpName() {
		return empName;
	}	  
}
