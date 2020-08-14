package com.java.beans;

public class Car {

	private Engine engine;
	
	
	public Car() {
		System.out.println("Car. 0-param constructor");
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
}
