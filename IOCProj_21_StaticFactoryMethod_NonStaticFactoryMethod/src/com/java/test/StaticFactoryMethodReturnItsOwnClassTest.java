package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;

public class StaticFactoryMethodReturnItsOwnClassTest {

	public static void main(String[] args) {
		
		ApplicationContext         context       =null;
		Employee                          employee    =null;
		
		//get IOC Container and load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/StaticFactoryMethodReturnItsOwnClass.xml");		
		
		employee  =context.getBean("emp",Employee.class);
		System.out.println(employee);
		System.out.println();
		
		System.out.println(context.getBean("cal"));
	}
}
