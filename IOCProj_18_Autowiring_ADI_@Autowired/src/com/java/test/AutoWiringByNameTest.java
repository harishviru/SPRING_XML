package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;
import com.java.beans.Employee;
import com.java.beans.Flipkart;

public class AutoWiringByNameTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
		Flipkart                         flipkart           =null; 
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/AutoWiringByName.xml");
		
		//AutoWiring byName
		System.out.println("Autowiring byName...........!");
		flipkart=context.getBean("flip",Flipkart.class);
		System.out.println(flipkart);
		System.out.println();
		
	}
}
