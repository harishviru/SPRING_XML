package com.java.beans;

public class Brake {

	private String brakeComp;
	
	public Brake() {
		System.out.println("Brake. o param constructor...!");
	}

	public String getBrakeComp() {
		return brakeComp;
	}

	public void setBrakeComp(String brakeComp) {
		this.brakeComp = brakeComp;
	}

	@Override
	public String toString() {
		return "Brake [brakeComp=" + brakeComp + "]";
	}
}
