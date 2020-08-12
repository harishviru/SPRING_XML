package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;

public class BeanInheritanceViaConstructorInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext context           =null;
	    Car                                car                  =null;	
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/BeanInheritanceViaConstructorInjection.xml");

		// Bean inheritance 
		car=context.getBean("harCar",Car.class);
		System.out.println("harCar---->"+car);
		
		car=context.getBean("palCar",Car.class);
		System.out.println("palCar---->"+car);
		
	}
	
}
