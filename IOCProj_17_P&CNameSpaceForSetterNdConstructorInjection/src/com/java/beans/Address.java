package com.java.beans;
public class Address {

	private String city;
	private long zipcode;

	public Address(String city, long zipcode) {
		System.out.println("Address. 2- param constructor");
		this.city = city;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}
}