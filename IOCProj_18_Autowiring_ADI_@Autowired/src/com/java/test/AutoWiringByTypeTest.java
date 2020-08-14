package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;
import com.java.beans.Employee;

public class AutoWiringByTypeTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
		Employee                         emp           =null; 
		Car                                     car              =null;
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/AutoWiringByType.xml");
		
		//Autowiring byType
		System.out.println("Autowiring byType...........!");
		emp=context.getBean("emp",Employee.class);
		System.out.println(emp);
		System.out.println();
		
		car=context.getBean("car",Car.class);
		System.out.println(car);
	}
}
