package com.java.beans;

public class HumanBeing {

	private String name;
	private HearBeat heartBeart;
	
	static{
		System.out.println("HumanBeing. Static Block..........!");
	}
	
	public HumanBeing() {
		System.out.println("HumanBeing. o-param constructor..!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public HearBeat getHeartBeart() {
		return heartBeart;
	}

	public void setHeartBeart(HearBeat heartBeart) {
		this.heartBeart = heartBeart;
	}

	@Override
	public String toString() {
		return "HumanBeing [name=" + name + ", heartBeart=" + heartBeart + "]";
	}
	
}
