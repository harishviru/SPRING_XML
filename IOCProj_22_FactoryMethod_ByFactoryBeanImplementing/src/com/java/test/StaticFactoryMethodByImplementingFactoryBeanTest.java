package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Animal;

public class StaticFactoryMethodByImplementingFactoryBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext         context            =null;
		Animal                                 animal              =null;
		
		//get IOC Container and load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/StaticFactoryMethodByFactoryBean.xml");		
		
		//get animal object from IOC Container
		animal =context.getBean("animal",Animal.class);	
		animal.sound();
		
	}
}
