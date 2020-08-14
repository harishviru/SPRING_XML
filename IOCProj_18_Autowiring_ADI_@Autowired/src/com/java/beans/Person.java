package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

	private String name ;
	@Autowired                                  //It uses byType mechanism           
	@Qualifier(value="addr")      //If IOC found two dependent objects we can resolve by using @Qualifier(value="addr") [As byName mechanism]
	private Address address;
	
	public Person() {
		System.out.println("Person. 0-param constructor..!");
	}
	
	public void setName(String name) {
		System.out.println("Person.setName()");
		this.name = name;
	}
	
	
	public void setaddress(Address address) {
		System.out.println("Person.setaddress()");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
}
