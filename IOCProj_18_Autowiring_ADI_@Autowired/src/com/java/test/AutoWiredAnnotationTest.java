package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.Person;

public class AutoWiredAnnotationTest {

	public static void main(String[] args) {
		
		ApplicationContext context            =null;
		Person                      person               =null;
		
		//create IOC Container & load XML File in it
		context =new ClassPathXmlApplicationContext("com/java/cfgs/@AutoWiringAnnontation.xml");
		
		 //get person object from IOC Container
		person       =context.getBean("per",Person.class);		
		System.out.println(person);
	}
}
