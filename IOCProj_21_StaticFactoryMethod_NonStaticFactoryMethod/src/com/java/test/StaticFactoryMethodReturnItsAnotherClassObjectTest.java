package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Cat;

public class StaticFactoryMethodReturnItsAnotherClassObjectTest {

	public static void main(String[] args) {
		
		ApplicationContext         context       =null;
		Cat                                            cat          =null;
		
		//get IOC Container and load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/StaticFactoryMethodReturnItsAnotherClass.xml");		
		
		//get animal object from IOC Container
		cat =context.getBean("animal",Cat.class);	
		cat.sound();
		
	}
}
