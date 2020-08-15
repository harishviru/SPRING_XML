package com.java.beans;

public class AnimalFactory {

	public static Cat getCat(){
	    System.out.println("AnimalFactory.getCat()");	
		return new Cat();
	}
	
}
