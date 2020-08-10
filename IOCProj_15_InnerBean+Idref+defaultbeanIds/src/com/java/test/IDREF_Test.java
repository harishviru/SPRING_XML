package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Car;

public class IDREF_Test {

	public static void main(String[] args) {
		ApplicationContext context           =null;
		 Car                       car                          =null;
		 
		//create IOC Container and Load XML File in it
		context        =new ClassPathXmlApplicationContext("com/java/cfgs/IdrefVsRef.xml");
		
		//get car object from IOC Container
		  car =context.getBean("car",Car.class);
		
		 System.out.println(car);
		 System.out.println("engine :"+car.getEngine());
		 System.out.println("engine ModalYear :"+car.getEngine().getModalYear());
	}

}
