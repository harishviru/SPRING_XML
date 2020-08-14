package com.java.beans;

public class Conductor {

	private String name;
	private String routeId;
	
	public Conductor() {
		System.out.println("Conductor. 0-param constructor..!");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	@Override
	public String toString() {
		return "Conductor [name=" + name + ", routeId=" + routeId + "]";
	}
	
}
