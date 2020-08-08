package com.java.beans;


public class Car {

	private String carName;
	private Engine engine;
	
	static{
		System.out.println("Car.StaticBlock ");
	}

	public Car(String carName, Engine engine) {
		System.out.println("Car. 2 param constructor........!");
		this.carName = carName;
		this.engine = engine;
	}
	
	public void printCarData(){
		System.out.println("*..start...."+Thread.currentThread().getStackTrace()[1].getMethodName()+".......................");
		
		System.out.println("carName-----"+carName);
		System.out.println("Engine.......(ModalYear)-----------"+engine.getModalYear());
		
		System.out.println("*..End...."+Thread.currentThread().getStackTrace()[1].getMethodName()+".......................");
		}
	
	
}
