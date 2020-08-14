package com.java.beans;

public class Bus {

	private Conductor conductor;

	public Bus(Conductor conductor) {
		System.out.println("Bus. 1-param constructor..!");
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return "Bus [conductor=" + conductor + "]";
	}
	
}