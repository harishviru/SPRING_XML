package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;
import com.java.beans.Student;

public class StaticVariableDependencyInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext         context       =null;
		Employee                          employee    =null;
		Student                              student      =null;
		
		//get IOC Container and load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/StaticVariableDI.xml");		
		
		//static variable with static method
		employee  =context.getBean("emp",Employee.class);
		System.out.println(employee.getEmpName());
		System.out.println();
		
		//static variable with non-static method
		student  =context.getBean("stud",Student.class);
		System.out.println(student.getStudName());
		System.out.println();
		
		//static variable with static method (API)
		System.out.println(context.getBean("javaVersion"));
		System.out.println(System.getProperty("java.version"));
	}
}
