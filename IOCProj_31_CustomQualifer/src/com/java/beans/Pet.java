package com.java.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Pet {

	@Autowired
	@CatQualifier
	private Animal animal;
	
	public Animal getAnimal() {
		return animal;
	}
	
}
