package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Bus;

public class AutoWiringByUsingConstructorTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
		Bus                                 bus                =null; 
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/AutoWiringByUsingConstructor.xml");
		
		//Autowiring by constructor
		System.out.println("Autowiring by using constructor...........!");
		bus=context.getBean("bus",Bus.class);
		System.out.println(bus);
		System.out.println();
		
	}
}
