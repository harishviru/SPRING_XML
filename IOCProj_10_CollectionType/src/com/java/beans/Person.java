package com.java.beans;

import java.util.HashSet;
import java.util.Properties;
import java.util.TreeMap;
import java.util.Vector;

public class Person {

	private Vector fruits;
	private HashSet cricketers;
	private TreeMap countryCapitals;
	private Properties mydbProps;
	
	static{
		System.out.println("Person . static Block.!");
	}
	
	public Person() {
		System.out.println("Person.0-param constructor...!");
	}

	public Vector getFruits() {
		return fruits;
	}

	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}

	public HashSet getCricketers() {
		return cricketers;
	}

	public void setCricketers(HashSet cricketers) {
		this.cricketers = cricketers;
	}

	public TreeMap getCountryCapitals() {
		return countryCapitals;
	}

	public void setCountryCapitals(TreeMap countryCapitals) {
		this.countryCapitals = countryCapitals;
	}

	public Properties getMydbProps() {
		return mydbProps;
	}

	public void setMydbProps(Properties mydbProps) {
		this.mydbProps = mydbProps;
	}

}
