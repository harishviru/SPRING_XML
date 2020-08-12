package com.java.beans;

public class Employee {

	private Integer empId;
	private String empName;
	private Address address;
	
	public Employee(Integer empId, String empName,Address address) {
		System.out.println("Employee. 3- param constructor...!");
		this.empId = empId;
		this.empName = empName;
		this.address=address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}

}
