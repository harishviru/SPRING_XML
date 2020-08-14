package com.java.beans;

public class Student {

	private Address address;
	
	public Student() {
		System.out.println("Student. 0-param constructor..!");
	}
	
	public Student(Address address) {
		System.out.println("Student. 1-param constructor..!");
		this.address = address;
	}
	
	public void setAddress(Address address) {
		System.out.println("Student.setAddress()");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [address=" + address + "]";
	}
}
