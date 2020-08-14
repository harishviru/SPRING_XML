package com.java.beans;

import org.springframework.stereotype.Component;

public class Engine {

	private String engineNo;
	private String modalYear;
	
	public Engine() {
		System.out.println("Engine. o-param constructor..!");
	}
	
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	
	public void setModalYear(String modalYear) {
		this.modalYear = modalYear;
	}

	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", modalYear=" + modalYear + "]";
	}

}
