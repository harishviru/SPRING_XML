package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Truck;

public class AutowiredAndComponetAnnotationTest {

	public static void main(String[] args) {
          ApplicationContext context            =null;
          
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/AutowiredNdComponetNdContextSchema.xml");
		
		 //get Truck object from IOC Container
	       System.out.println(context.getBean("truck"));                          //If we use @component annotation then IOC uses "truck" as bean name
	       System.out.println(context.getBean(Truck.class));
	      System.out.println(context.getBean("com.java.beans.Engine#0"));   //If we use <bean> element then IOC uses "com.java.beans.Engine#0" as bean name
	}
	
}
