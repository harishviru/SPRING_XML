package com.java.beans;

public class Car {

	private String regNo;
	private String model;
	private String company;
	private String color;
	private String owner;
    private String fuelType;
    
	public Car(String regNo, String model, String company, String color, String owner,String fuelType) {
	    System.out.println("Car. 8 -param constructor...!");
		this.regNo = regNo;
		this.model = model;
		this.company = company;
		this.color = color;
		this.owner = owner;
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", model=" + model + ", company=" + company + ", color=" + color + ", owner="
				+ owner + ", fuelType=" + fuelType + "]";
	}



}
