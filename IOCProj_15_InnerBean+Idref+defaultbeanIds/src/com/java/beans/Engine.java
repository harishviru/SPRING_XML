package com.java.beans;

public class Engine {

	private String modalYear;
    private Brake  brake; 
   
	
	public Engine(String modalYear,Brake  brake) {
        System.out.println("Engine. 2 param constructor...!");
		this.modalYear = modalYear;
		this.brake=brake;
	}

	public String getModalYear() {
		return modalYear;
	}

	@Override
	public String toString() {
		return "Engine [modalYear=" + modalYear + ", brake=" + brake + "]";
	}
	
}
