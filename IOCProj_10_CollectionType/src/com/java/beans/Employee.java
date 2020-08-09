package com.java.beans;

import java.util.Properties;

public class Employee {

	private String[] empNames;
	private Properties empIdDesig;
	
	static{
		System.out.println("Employee. static Block");
	}

	public Employee(String[] empNames,Properties empIdDesig) {
		System.out.println("Employee. 2-param constructor.......!");
		this.empNames = empNames;
		this.empIdDesig=empIdDesig;
	}

	public Properties getEmpIdDesig() {
		return empIdDesig;
	}

	public String[] getEmpNames() {
		return empNames;
	}
	
}
