package com.java.beans;

public class Employee {

	private String empName;
	private int empAge;
	
	public Employee() {
		System.out.println("Employee. 0-param constructor");
		this.empName="Harish";
		this.empAge=25;
	}
	
	private static Employee emp;
	 
	public static Employee getEmp(){
		if(emp==null){
			emp=new Employee();
		}
		return emp;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + "]";
	}
	
	
}
