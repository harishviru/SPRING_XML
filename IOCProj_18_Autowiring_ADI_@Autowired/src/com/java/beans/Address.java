package com.java.beans;
public class Address {

	private  String city;
	private long zipcode;

	public Address() {
	     System.out.println("Address. 0-param constructor...!");
	}
  
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}
}