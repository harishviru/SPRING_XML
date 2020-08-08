package com.java.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.beans.A;

public class CyclicDITestUsingConstructor {

	public static void main(String[] args) {
		ApplicationContext context =null;
		 A a                                             =null;
		
		//create IOC Container & load XML File in it
		 context=new ClassPathXmlApplicationContext("com/java/cfgs/CyclicDIofConstructor.xml");
	
		//get  A class object from IOC Container
		 a =  context.getBean("a",A.class);
	}
	
}
