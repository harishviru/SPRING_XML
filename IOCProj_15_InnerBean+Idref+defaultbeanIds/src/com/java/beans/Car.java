package com.java.beans;

public class Car {

	private String carName;
	private Engine engine;
	
	public Car() {
		System.out.println("Car -o param constructor");
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", engine=" + engine + "]";
	}

}
