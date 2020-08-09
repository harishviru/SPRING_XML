package com.java.beans;

public class Employee {

	private String empId;
	private String empName;
	private Address empAddress;
	
	
	static{
		System.out.println("Employee.Static Block......!");
	}

	public Employee(String empId, String empName, Address empAddress) {
		System.out.println("Employee. 3 -param constructor.......!");
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	
	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

}
