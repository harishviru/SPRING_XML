package com.java.beans;

public  class Truck {

	public Truck(){
		System.out.println("Truck .0-param constructor..!");
	}
	
	public  Engine getEngine() {
		System.out.println("Truck.getEngine()");
		Engine eng = new Engine();
		eng.setEngineName("Eicher");
		return eng;
	};

}
