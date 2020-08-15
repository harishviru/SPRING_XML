package com.java.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Programmatic  Approach
 *
 */
public class Employee implements InitializingBean,DisposableBean {

	private String empName;

	public Employee() {
		System.out.println("Employee. 0-param constructor..!");
	}
	
	public void setEmpName(String empName) {
		System.out.println("Employee.setEmpName()");
		this.empName = empName;
	}
	  public String getEmpName() {
		return empName;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	   System.out.println("Employee.afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Employee.destroy()");
	}
}
