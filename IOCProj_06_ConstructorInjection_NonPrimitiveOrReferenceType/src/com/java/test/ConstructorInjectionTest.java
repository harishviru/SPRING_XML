package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;


public class ConstructorInjectionTest {

	public static void main(String[] args) {
		//Create IOC Container & load XML File into Container
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/cfgs/ConstructorInjection.xml");
		
		//get CAR object from IOC Container
		Car car  = context.getBean("car", Car.class);
		
		//call  
        car.printCarData();
	
	}

	
	
}
