package com.java.beans;

public class Engine {

	private String modalYear;
	
	static{
		System.out.println("Engine.Static Block");
	}

	public String getModalYear() {
		return modalYear;
	}

	public void setModalYear(String modalYear) {
		System.out.println("Engine.setModalYear() Method ...........!");
		this.modalYear = modalYear;
	}

}
