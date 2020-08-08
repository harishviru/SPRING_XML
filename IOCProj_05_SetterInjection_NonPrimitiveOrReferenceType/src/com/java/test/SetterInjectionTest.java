package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//Create IOC Container & load XML File into Container
		ApplicationContext context=new ClassPathXmlApplicationContext("com/java/cfgs/SetterInjection.xml");
		
		//get WishMessageGenerator object from IOC Container
		WishMessageGenerator wishMsg  = context.getBean("wish", WishMessageGenerator.class);
		
		//call generateWishMessage
		 System.out.println("Wish Message----->"+wishMsg.generateWishMessage("HarishViru"));
	}
	
}
