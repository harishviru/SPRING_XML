package com.java.beans;

public class Employee {

	private Integer empId;
	private String empName;
	private Address address;
	
	
	public Employee() {
		System.out.println("Employee. 0-param constructor...!");
	}

	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		System.out.println("Employee.setEmpId()");
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		System.out.println("Employee.setEmpName()");
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("Employee.setAddress()");
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}


}
