package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Employee;

public class J2EEAnnotationTest {

	public static void main(String[] args) {
           
		ApplicationContext context                 =null;
		Employee emp                                        =null;
		
		context = new ClassPathXmlApplicationContext("com/java/cfgs/J2EEAnnotationInSpring.xml");

		 emp = context.getBean("emp", Employee.class);
		System.out.println(emp);
	}

}
