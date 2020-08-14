package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck {

	@Autowired
	private Engine engine;

	@Override
	public String toString() {
		return "Truck [engine=" + engine + "]";
	}
	
}
